class Solution {
    public void moveZeroes(int[] nums) { 
        int emptyPosition=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[emptyPosition]=nums[i];
                emptyPosition++;
            } 
        }
        
        for(int i=emptyPosition; i<nums.length; i++){
            nums[i]=0;
        }        
    }
}