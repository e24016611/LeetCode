package leet.p100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P169 {
    public int majorityElement(int[] nums) {
        
    	int majority = 0 ;
    	Map<Integer, MutableInt> freq = new HashMap<Integer, MutableInt>();
    	
    	for(int i:nums) {
    		
    		if(!freq.containsKey(i)) {
    			freq.put(i, new MutableInt());
    		} else {
    			freq.get(i).increment();
    		}
    	    if(freq.get(i).get() > (nums.length/2)){
    			majority = i;
                break;
    		}

    		
    	}
        
    	return majority;
    	
    }
}
class MutableInt {
	  int value = 1; // note that we start at 1 since we're counting
	  public void increment () { ++value;      }
	  public int  get ()       { return value; }
	}

// Fatest Solution

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}




