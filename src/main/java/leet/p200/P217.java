package leet.p200;

import java.util.Set;
import java.util.HashSet;


public class P217 {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> result = new HashSet<Integer>();
        
        for(int i:nums){
            result.add(i);
        }
        
        if(result.size() == nums.length) {
        	return false;
        }else {
        	return true;
        }
        
        
    }
}

// Fatest Solution

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1 ){
            return false;
        }
        int min = nums[0]; 
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }else if(nums[i] > max){
                max = nums[i];
            }
        }
        if((max - min + 1 ) < nums.length){
            return true;
        }
        boolean[] results = new boolean[max - min + 1];
        for(int i = 0; i < nums.length; i++){
            int index = nums[i] - min;
            if(results[index]){
                return true;
            }
            results[index] = true;
        }
        return false;
    }
}