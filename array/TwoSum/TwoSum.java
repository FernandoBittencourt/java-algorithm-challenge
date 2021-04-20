class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbersVisited = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            Integer indexOfComplement = numbersVisited.get(complement);
            if(indexOfComplement!=null){
                return new int[]{indexOfComplement, i};
            }
            numbersVisited.put(nums[i],i);
        }
        return null;
    }
}