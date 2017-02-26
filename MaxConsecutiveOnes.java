public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxCount = 0;
        int index = getPositionOfOne(nums, 0);
        while(index < nums.length){
            int currentCount = 0;
            while(index < nums.length && nums[index] != 0){
                currentCount++;
                index++;
            }
            if(maxCount < currentCount){
                maxCount = currentCount;
            }
            if(index < nums.length){
                index = getPositionOfOne(nums, index);
            }
        }
        return maxCount;
    }
    
    public int getPositionOfOne(int[] nums, int index){
        while(index < nums.length){
            if(nums[index] == 1){
                return index;
            }
            index++;
        }
        return index;
    }
}
