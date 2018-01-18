package leet.p600;

public class P674 {
    public int findLengthOfLCIS(int[] nums) {
    	
        if(nums.length == 0){
            return 0;
        }
        
    	int maxLength = 1 ,localMaxLength = 1;
    	
    	for(int i = 0 ;i < nums.length-1 ;i++){
    		if(nums[i+1] > nums[i]){
    			localMaxLength ++;
    			maxLength = Math.max(maxLength, localMaxLength);
    		}else{
    			localMaxLength = 1;
    		}
    		
    	}
    	
    	return maxLength;
    }
}
