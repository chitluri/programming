public class Solution {
    public int hammingDistance(int x, int y) {
        int hammingDistance = 0;
        while(x != 0 || y != 0){
            int xBit = x & 1;
            int yBit = y & 1;
            if(xBit != yBit){
                hammingDistance++;
            }
            x = x >>> 1; // >>> is unsigned Right Shift
            y = y >>> 1;
        }
        return hammingDistance;
    }
    
}
