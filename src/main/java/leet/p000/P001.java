package leet.p000;

import java.util.HashMap;
import java.util.Map;

public class P001 {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer ,Integer> diff = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            
            if(diff.containsKey(nums[i])){
               return new int[] {i ,diff.get(nums[i])}; 
            }
            
            diff.put((target-nums[i]) ,i);
        }
        
		return null;    
    }
    
    public static void main(String[] args) {
    	
    	P001 p01 = new P001();
    	
    	p01.twoSum(new int[] {2 ,7 ,11 ,13}, 9);
    	
    }
}
