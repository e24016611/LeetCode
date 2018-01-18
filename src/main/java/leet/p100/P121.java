package leet.p100;

import java.util.Arrays;

public class P121 {
    public int maxProfit(int[] prices) {
        
    	int localMinPrice = Integer.MAX_VALUE ,maxProfit = 0 ,localMaxProfit = 0 ;
    	
    	for(int price:prices){
    		
    		if(price < localMinPrice){
    			localMinPrice = price;
    			localMaxProfit = 0;
    		}else{
    			localMaxProfit = Math.max(localMaxProfit, (price - localMinPrice));
    			maxProfit = Math.max(maxProfit ,localMaxProfit);
    		}
    		
    	}

    	   	
    	return maxProfit;
    }
}
