class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> final_result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int i : candies){
            arr.add(i);
        }
        int max = Collections.max(arr);
        for(int i : arr){
            if(i + extraCandies >= max){
                final_result.add(true);
            }else{
                final_result.add(false);
            }
        }
        return final_result;
    }
}