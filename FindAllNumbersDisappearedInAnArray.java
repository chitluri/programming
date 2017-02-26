public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        
        //Make sure input is valid and has atleast one element.
        if(nums == null || nums.length == 0){
            return resultList;
        }
        
        for(int i=0; i<nums.length; i++){
            int num = Math.abs(nums[i]);
            if(! (nums[num-1] < 0)){
                nums[num-1] *= -1;
            }
        }
        
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                resultList.add(i+1);
            }
        }
        
        return resultList;
    }
}
