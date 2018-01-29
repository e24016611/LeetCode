package leet.p600;

public class P605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    	
    	int max = 0;
		
    	for(int i = 0 ;i<flowerbed.length ;i++) {
    		int prev = i-1 < 0? 0:flowerbed[i-1] ,next = i+1 == flowerbed.length? 0:flowerbed[i+1];
    		if(flowerbed[i]==0 && prev == 0 && next ==0) {
    			flowerbed[i] = 1;
    			max ++;
    		}
    	}
    	
    	
    	return max >= n;
    }
}
