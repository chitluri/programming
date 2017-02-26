public class Solution {
    public int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        
        //HALF_ADDER LOGIC. This can also be applied to regualr decimal numbers.
        int sum = a ^ b;
        int carry = a & b;
        carry = carry << 1;
        return getSum(sum, carry);
    }
}
