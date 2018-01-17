package leet.p600;

public class P696 {
    public int countBinarySubstrings(String s) {
        
    	int result = 0;
    	char[] digits = s.toCharArray();
    	
    	for(int i = 0 ;i < digits.length-1 ;i++){
    	
    		if(digits[i] != digits[i+1]){
    			result ++;
    			for(int j = 1 ;j < (digits.length/2) ;j++){
    				if((i-j) < 0 || (i+1+j) >= digits.length){
    				    break;   					
    				}
    				if((digits[i-j] == digits[i]) && (digits[i+1+j] == digits[i+1])){
    					result ++;
    				}else{
    					break;
    				}
    				
    			}
    		}
    		
    	}
    	
    	return result;
    }
}
