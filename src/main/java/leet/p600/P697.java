package leet.p600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P697 {
    public int findShortestSubArray(int[] nums) {

    	int degree = 0 ,min = Integer.MAX_VALUE;
    	List<Integer> max = new ArrayList<Integer>();
    	Map<Integer, MutableInt> freq = new HashMap<Integer, MutableInt>();
    	for(int i:nums) {
    		
    		if(!freq.containsKey(i)) {
    			freq.put(i, new MutableInt());
    		} else {
    			freq.get(i).increment();
    		}
    		int times = freq.get(i).get();
    		if(times == degree) {
    			max.add(i);
    		}else if(times > degree) {
    			degree = times;
    			max.clear();
    			max.add(i);
    		}
    		
    	}
    	
    	for(int target:max) {
    		
    		int start =0,end =0;
    		
    		for(int i=0 ;i<nums.length; i++) {
    			
    			if(nums[i] == target) {
    				start = i;
    				break;
    			}
    			
    		}
    		for(int i=(nums.length-1) ;i>=0; i--) {
    			
    			if(nums[i] == target) {
    				end = i;
    				break;
    			}
    			
    		}
    		
    		min = Math.min(min, (end - start +1));
    		
    	}
    	
    	
    	
    	return min;

    }
}

class MutableInt {
	  int value = 1; // note that we start at 1 since we're counting
	  public void increment () { ++value;      }
	  public int  get ()       { return value; }
	}




// Fatest Solution

class Solution {
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int maxNum = 0;
        for (int n : nums){
            maxNum = Math.max(n, maxNum);
        }

        int[] start = new int[maxNum + 1];
        int[] end = new int[maxNum + 1];
        int[] que = new int[maxNum + 1];

        for (int i = 0; i < nums.length; i++){
            if (que[nums[i]] == 0)
                start[nums[i]] = i;
            end[nums[i]] = i;
            que[nums[i]]++;
        }

        int max = 0;
        for (int n : que)
            max = Math.max(max, n);

        List<Integer> maxNums = new ArrayList<>();
        for (int i = 0; i < que.length; i++){
            if (que[i] == max)
                maxNums.add(i);
        }

        int res = nums.length;
        for (int n : maxNums){
            int r = end[n] - start[n] + 1;
            res = Math.min(r, res);
        }

        return res;
    }
}
