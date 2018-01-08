package leet.p500;

import org.junit.jupiter.api.Test;

public class P566 {
	
    @Test
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int[] column = new int[c];
        int[][] matrix = new int[r][];
        
        int nowRow = 0,nowColumn = 0;
        
        if(r*c != nums.length*nums[0].length) {
        	return nums;
        }
        
        for(int i = 0;i < nums.length;i++) {
        	for(int j = 0;j < nums[i].length; j++) {
        		
        		column[nowColumn ++] = nums[i][j]; 		
        		if(nowColumn >= c) {
        			matrix[nowRow ++] = column;
        			column = new int[c];
        			nowColumn = 0;
        		}
        	}
        }
        
        
        
        return matrix;
        
    }
	
	
}
