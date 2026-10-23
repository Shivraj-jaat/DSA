class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, salary[i]);
            mini = Math.min(mini, salary[i]);
        }
        double avg = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(salary[i] != maxi && salary[i] != mini){
                sum += salary[i];
            }
        }
        avg = (double)sum/(n-2);
        return avg;
    }
}