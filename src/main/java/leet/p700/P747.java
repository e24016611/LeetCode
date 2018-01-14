package leet.p700;

public class P747 {
    public int dominantIndex(int[] nums) {
        
        int result = -1 ,max = Integer.MIN_VALUE ,max_index =0 ,second = Integer.MIN_VALUE;
        
        for(int i = 0;i < nums.length;i++) {
        	if(nums[i] > max) {
        		second = max;
        		max = nums[i];
        		max_index = i;        		
        	}else if(max > nums[i] && nums[i] > second) {
        		second = nums[i];
        	}
        	
        }
        
        if(max >= second*2) {
        	result = max_index;
        }
        
        
        return result;
    }
}
