package leet.p200;

public class P283 {
	
    public int[] moveZeroes(int[] nums) {
		
    	int index = 0;
    	
    	for(int i:nums) {
    		if(i != 0) {
    			nums[index ++] = i;
    		}
    	}
    	for(int i = index; i < nums.length;i++) {
    		nums[i] = 0 ;    		
    	}
    	
    	return nums;
    }

}
