public class Solution {
    public char findTheDifference(String s, String t) {
        if(s == null || t == null){
            return '$';
        }
        
        if(s.length() + 1 != t.length()){
            return '$';
        }
        
        if(t.length() == 1){
            return t.charAt(0);
        }
        
        int result = s.charAt(0) ^ t.charAt(0);
        for(int i=1; i<s.length(); i++){
            result = result ^ s.charAt(i);
            result = result ^ t.charAt(i);
        }
        result = result ^ t.charAt(t.length() - 1);
        
        return (char)result;
    }
}
