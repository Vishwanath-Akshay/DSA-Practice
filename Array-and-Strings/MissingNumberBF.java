class MissingNumberBF{
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int total = n*(n+1)/2;
       int totalArray=0;
       for(int i=0;i<n;i++){
        totalArray += nums[i];
       }
        return total-totalArray;
    }   
}
// TC : O(n);