class LongestNumber {
    public int largestElement(int[] nums) {
        int longest=nums[0];
        for(int i=1 ; i<nums.length;i++){
            if(longest < nums[i]){
                longest=nums[i];
            }
        }
        return longest;
    }
}