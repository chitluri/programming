public class Solution {
    public String[] findWords(String[] words) {
        if(words == null || words.length == 0){
            return new String[0];
        }
        
        Set<Character> firstRow = new HashSet<>(Arrays.asList('Q', 'W', 'E','R','T','Y','U','I','O','P'));
        Set<Character> secondRow = new HashSet<>(Arrays.asList('A', 'S', 'D','F','G','H','J','K','L'));
        Set<Character> thirdRow = new HashSet<>(Arrays.asList('Z', 'X', 'C','V','B','N','M'));
        
        List<String> resultWords = new ArrayList<>();
        for(String word: words){
            Set<Character> selectedRow = chooseARow(word.charAt(0), firstRow, secondRow, thirdRow);
        
            if(checkIfBelongsTo(selectedRow, word)){
                resultWords.add(word);
            }
        }
        
        return resultWords.stream()
                .toArray(size -> new String[size]);
    }
    
    public Set<Character> chooseARow(Character c, Set<Character> firstRow, Set<Character> secondRow, Set<Character> thirdRow){
        Set<Character> selectedRow = null;
        if(firstRow.contains(Character.toUpperCase(c))){
            selectedRow = firstRow;
        }
        if(secondRow.contains(Character.toUpperCase(c))){
            selectedRow = secondRow;
        }
        if(thirdRow.contains(Character.toUpperCase(c))){
            selectedRow = thirdRow;
        }
        return selectedRow;
    }
    
    public boolean checkIfBelongsTo(Set<Character> selectedRow, String word){
        for(int i=0; i<word.length(); i++){
            if(!selectedRow.contains(Character.toUpperCase(word.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
