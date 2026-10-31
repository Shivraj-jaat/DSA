class Solution {

     public int firstOccurence(int target, int[] arr){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int ans = -1;

        while(l <= h){
            int mid = l + (h-l)/2;

            if(arr[mid] == target){
                ans = mid;
                h = mid - 1;
            }
            else if(arr[mid] < target){
                    l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return ans;
     }

       public int secondOccurence(int target, int[] arr){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int ans = -1;

        while(l <= h){
            int mid = l + (h-l)/2;

            if(arr[mid] == target){
                ans = mid;
                l = mid + 1;
            }
            else if(arr[mid] < target){
                    l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return ans;
     }


    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(target, nums);
        int second = secondOccurence(target, nums);

        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = second;

        return ans;
    }
}