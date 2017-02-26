public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<String>();
        if(n < 1){
            return results;
        }
        for(int i=1; i<= n; i++){
            if(i%3 == 0 && i%5 == 0){
                results.add("FizzBuzz");
                continue;
            }
            if(i%3 == 0){
                results.add("Fizz");
                continue;
            }
            if(i%5 == 0){
                results.add("Buzz");
                continue;
            }
            else{
                results.add(Integer.toString(i));
            }
        }
        
        return results;
        
    }
}
