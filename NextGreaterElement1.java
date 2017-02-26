public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> indexToGreatestMap = new HashMap<>();
        List<Integer> toBeFoundList = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            processCurrentElement(indexToGreatestMap, toBeFoundList, i, nums);    
        }
        
        //Map numbers in nums to their indexes
        Map<Integer, Integer> numberToIndexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            numberToIndexMap.put(nums[i], i);
        }
        
        int[] resultArray = new int[findNums.length];
        int count = 0;
        for(int i : findNums){
            //Get index of this number from nums
            Integer index = numberToIndexMap.get(i);
            //Get solution associated with that index from indexToGreatestMap
            Integer nextGreatestNumber = indexToGreatestMap.get(index);
            if(nextGreatestNumber == null){
                //If it solution doesn't exist use -1
                resultArray[count] = -1;
            }
            else{
                resultArray[count] = nextGreatestNumber;
            }
            count++;
        }
        return resultArray;
    }
    
    public void processCurrentElement(Map<Integer, Integer> indexToGreatestMap, List<Integer> toBeFoundList, int index, int[] nums){
        while(!toBeFoundList.isEmpty() && nums[toBeFoundList.get(toBeFoundList.size() - 1)] < nums[index] ){
            indexToGreatestMap.put(toBeFoundList.get(toBeFoundList.size() - 1), nums[index]);
            toBeFoundList.remove(toBeFoundList.size() - 1);
        }
        toBeFoundList.add(index);
    }
}
