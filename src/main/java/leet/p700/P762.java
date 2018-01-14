package leet.p700;

public class P762 {
    public int countPrimeSetBits(int L, int R) {
        
    	int result = 0;
    	
    	for(int i = L ;i <= R ;i++) {
    		char[] temp = Integer.toBinaryString(i).toCharArray();
    		if(isPrime(countOne(temp))) {
    			result ++;
    		}
    	}
    	
    	
    	return result;
    }
    
    public boolean isPrime(int checknum){
        
    	if(checknum == 1) {
    		return false;
    	} else if(checknum == 2) {
    		return true;
    	}
    	
        for(int i=2 ;i<=Math.pow(checknum ,0.5) ;i++) {
        	if((checknum % i) == 0 ) {
        		return false;
        	}
        }
        
        return true;
    }
    
    public int countOne(char[] binary) {
    	
    	int total = 0;
    	
    	for(char c:binary) {

    		total += Character.getNumericValue(c);

    	}
    	
    	return total;
    	
    }
    
    
    
}
