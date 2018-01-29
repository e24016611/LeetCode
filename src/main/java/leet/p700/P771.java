package leet.p700;

import java.util.Arrays;

public class P771 {
    public int numJewelsInStones(String J, String S) {
        
        char[] jewels = J.toCharArray() ,stones = S.toCharArray();
        int result = 0;
        Arrays.sort(jewels);
        
        for(char stone:stones) {
        	int index = binarySearch(stone ,jewels);
            if(index != -1) {
            	result ++;
            }
        }       
        
        return result;
    }
    private int binarySearch(char j ,char[] stones) {
    	
    	int head = 0 ,tail = stones.length -1 ,mid ,index = -1;
    	while(head <= tail) {
    		mid = (head + tail)/2;
    		if(stones[mid] == j) {
    			index = mid;
    			break;
    		}else if(stones[mid] < j){
    			head = mid + 1;
    		}else if(stones[mid] > j) {
    			tail = mid -1;
    		}
    	}
    	
    	return index;
    }
}
