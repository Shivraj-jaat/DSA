import java.util.*;

class Solution {

    private List<Integer>[] tree;
    private int[] parent, depth, heavy, head, pos, size;
    private int curPos;
    private SegmentTree seg;
    private char[] chars;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {

        chars = s.toCharArray();

        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            tree[e[0]].add(e[1]);
            tree[e[1]].add(e[0]);
        }

        parent = new int[n];
        depth = new int[n];
        heavy = new int[n];
        size = new int[n];

        Arrays.fill(heavy, -1);

        dfs(0, -1);

        head = new int[n];
        pos = new int[n];
        curPos = 0;

        decompose(0, 0);

        int[] base = new int[n];
        for (int i = 0; i < n; i++) {
            base[pos[i]] = 1 << (chars[i] - 'a');
        }

        seg = new SegmentTree(base);

        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {

            String[] parts = q.split(" ");

            if (parts[0].equals("update")) {

                int node = Integer.parseInt(parts[1]);
                char c = parts[2].charAt(0);

                chars[node] = c;
                seg.update(pos[node], 1 << (c - 'a'));

            } else {

                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);

                int mask = queryPath(u, v);

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }

    private void dfs(int u, int p) {

        parent[u] = p;
        size[u] = 1;

        int maxSize = 0;

        for (int v : tree[u]) {

            if (v == p) continue;

            depth[v] = depth[u] + 1;

            dfs(v, u);

            size[u] += size[v];

            if (size[v] > maxSize) {
                maxSize = size[v];
                heavy[u] = v;
            }
        }
    }

    private void decompose(int u, int h) {

        head[u] = h;
        pos[u] = curPos++;

        if (heavy[u] != -1) {
            decompose(heavy[u], h);
        }

        for (int v : tree[u]) {

            if (v == parent[u] || v == heavy[u]) continue;

            decompose(v, v);
        }
    }

    private int queryPath(int a, int b) {

        int res = 0;

        while (head[a] != head[b]) {

            if (depth[head[a]] < depth[head[b]]) {
                int t = a;
                a = b;
                b = t;
            }

            res ^= seg.query(pos[head[a]], pos[a]);

            a = parent[head[a]];
        }

        if (depth[a] > depth[b]) {
            int t = a;
            a = b;
            b = t;
        }

        res ^= seg.query(pos[a], pos[b]);

        return res;
    }

    static class SegmentTree {

        int n;
        int[] tree;

        SegmentTree(int[] arr) {

            n = arr.length;
            tree = new int[4 * n];

            build(1, 0, n - 1, arr);
        }

        private void build(int node, int l, int r, int[] arr) {

            if (l == r) {
                tree[node] = arr[l];
                return;
            }

            int mid = (l + r) >> 1;

            build(node * 2, l, mid, arr);
            build(node * 2 + 1, mid + 1, r, arr);

            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        private void update(int node, int l, int r, int idx, int val) {

            if (l == r) {
                tree[node] = val;
                return;
            }

            int mid = (l + r) >> 1;

            if (idx <= mid)
                update(node * 2, l, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, r, idx, val);

            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }

        int query(int L, int R) {
            return query(1, 0, n - 1, L, R);
        }

        private int query(int node, int l, int r, int L, int R) {

            if (R < l || r < L) return 0;

            if (L <= l && r <= R) return tree[node];

            int mid = (l + r) >> 1;

            return query(node * 2, l, mid, L, R)
                    ^ query(node * 2 + 1, mid + 1, r, L, R);
        }
    }
}