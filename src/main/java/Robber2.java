import java.lang.reflect.Array;
import java.util.Arrays;

public class Robber2 {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        return Math.max(maxRobProfit(Arrays.copyOfRange(nums, 0, nums.length-1)) ,maxRobProfit(Arrays.copyOfRange(nums, 1, nums.length)));
  
    }
    
    public int maxRobProfit(int[] nums) {
        
    	int length = nums.length;
        int[] maxProfit = new int[length];
        
        
        for(int i = 0 ;i < length ;i++){
         	maxProfit[i] = Math.max(i-2 >= 0?maxProfit[i-2]:0 ,i-3 >= 0?maxProfit[i-3]:0) + nums[i];
        }
        
        
        return Math.max(length-2>=0?maxProfit[length-2]:0 ,length-1>=0?maxProfit[length-1]:0);
        
    }
}
