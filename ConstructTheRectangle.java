public class Solution {
    
    public class Factor{
        int first;
        int second;
        public Factor(int first, int second){
            this.first = first;
            this.second = second;
        }
        
        public String toString(){
            return "("+first+","+second+")";
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
        
        @Override
        public boolean equals(Object o) {
    
            if (o == this) return true;
            if (!(o instanceof Factor)) {
                return false;
            }
            Factor factor = (Factor) o;
            return first == factor.first &&
                    second == factor.second;
        }
    }
    
    public int[] constructRectangle(int area) {
        //Find all factors for the number represented by "area"
        Set<Factor> factors = findFactors(area);
        
        //For each factor pair apply first two rules given.
        factors = factors.stream()
                    .filter(factor -> {return (factor.first >= factor.second);})
                    .collect(Collectors.toSet());
                    
        
        //To satisfy third rule, Collect the remainaing and find Optimal.
        Factor optimalFactor = null;
        int minDiff = Integer.MAX_VALUE;
        for(Factor factor: factors){
            int currentDiff = factor.first - factor.second;
            if(minDiff > currentDiff){
                minDiff = currentDiff;
                optimalFactor = factor;
            }
        }
        
        return new int[]{optimalFactor.first, optimalFactor.second};
    }
    
    public Set<Factor> findFactors(int n){
        Set<Factor> factorList = new HashSet<>();
        int sqrt = (int)Math.sqrt(n);
        for(int i=1; i<=sqrt; i++){
            if(n % i == 0){
                factorList.add(new Factor(i, n/i));
                factorList.add(new Factor(n/i, i));
            }
        }
        return factorList;
    }
}
