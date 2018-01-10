package leet.p700;

public class P717 {
    public boolean isOneBitCharacter(int[] bits) {
        
        int last = 0 , length = bits.length;
        boolean result = true;
        
       for(int i = last; i < length-1; i++){
        	
        	if(bits[i] == 1){
        		i++;
        	}
        	
        	if(i == (length -1)){
        		result = false;
        	}
        }
        
        
		return result;
    }
}
