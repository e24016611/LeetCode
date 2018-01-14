package leet.p700;

public class P746 {
    public int minCostClimbingStairs(int[] cost) {
        
    	int length = cost.length ,costVal;
    	int[] minCost = new int[length+1];
    	
    	minCost[0] = cost[0];
    	minCost[1] = cost[1];
    	
    	
    	for(int i = 2 ;i <= length ;i++) {
    		costVal = i == length?0:cost[i];
    		minCost[i] = Math.min(minCost[i-1] + costVal, minCost[i-2] + costVal);
    	}
    	
    	return minCost[length];
    }
    

}
