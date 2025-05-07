class Solution {
    public int secondLargestElement(int[] nums) {
        //first one is sort and then check for the second larhest elemet 
        int second=-1;
        int largest=nums[0];
        for(int i=1;i<nums.length ;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>second && nums[i]!=largest){
                second=nums[i];
            }
        }
        return second;
    }
}