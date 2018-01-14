package leet.p600;

import java.util.Arrays;

public class P628 {
    

	public int maximumProduct(int[] nums) {
        
        int result ,length = nums.length;
        
        Arrays.sort(nums);
               
        if(nums[0] >= 0) {
        	result = nums[length-1]*nums[length-2]*nums[length-3];
        }else {
        	result = Math.max(nums[length-1]*nums[length-2]*nums[length-3], nums[length-1]*nums[0]*nums[1]);
        }
        
        return result;
    }

}

//Fatest Solution

class Solution628 {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i=0;i < nums.length; i++) {
            
            if(nums[i] >=  max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] >=  max2) {
                max3 = max2;
                max2 =  nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }
            
            
            if(nums[i] <= min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2= nums[i];
            }
        }
        
        return max1 *  Math.max(max2 * max3, min1 * min2);
    }
}



