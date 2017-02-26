public class Solution {
    public String reverseString(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] str = s.toCharArray();
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return new String(str);
    }
}
