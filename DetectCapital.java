public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0){
            return true;
        }
        //If first character is UPPER CASE, then all remaining must be either all lower or all upper case.
        if(Character.isUpperCase(word.charAt(0))){
            return isUpperCase(word) || isLowerCase(word);
        }
        
        //If first character is lower case, then all remaining must be lower case.
        if(Character.isLowerCase(word.charAt(0))){
            return isLowerCase(word);
        }
        return false;
    }
    
    public boolean isUpperCase(String word){
        int i = 1;
        while(i < word.length()){
            if(!Character.isUpperCase(word.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }
    
    public boolean isLowerCase(String word){
        int i = 1;
        while(i < word.length()){
            if(!Character.isLowerCase(word.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }
}
