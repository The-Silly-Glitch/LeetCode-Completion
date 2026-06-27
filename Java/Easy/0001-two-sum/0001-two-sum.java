class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] elements;
        
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                int total = nums[i] + nums[j] ;
                if(total == target){
                    elements = new int[]{i, j};
                    return elements;
                }
            }
        }
        return null;
    }
}