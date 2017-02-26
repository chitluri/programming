public class Solution {
    public int addDigits(int num) {
        int result = 0;
        while(num > 0){
            result += num % 10;
            //If result goes above 9, remove 9 from it, because casting out 9's give the 
            //same result as adding all numbers to get a single digit.
            if(result > 9){
                result = result - 9;
            }
            num = num / 10;
        }
        return result;
    }
}
