package leet.p400;

public class P485 {
    public int findMaxConsecutiveOnes(int[] nums) {
		
    	int result = 0 ,temp = 0;
    	
    	for(int i:nums){
    		if(i == 1){
    			temp ++;
    			result = Math.max(temp, result);
    		}else{
    			temp = 0;
    		}
    	}
    	
    	
    	
    	return result;
    }
}
