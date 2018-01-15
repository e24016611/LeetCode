package leet.p600;

public class P661 {
    public int[][] imageSmoother(int[][] M) {
        
    	int length = M.length ,width = M[0].length;
    	int[][] result = new int[length][width];
    	
    	for(int row = 0; row < length; row++){
    		for(int column = 0; column < width; column++){
				result[row][column] = mask(row ,column ,M);
    		}
    	}
        return result;
    }
    // 2x Faster with moving this logic out of loop
    public int mask(int row ,int column ,int[][] M){
    	
		int count = 0 ,value = 0 ,length = M.length ,width = M[0].length;
		
		for(int i = -1 ;i <= 1 ;i++){
			for(int j = -1 ;j <= 1 ;j++){
				if((row + i) >= 0 && (column + j) >= 0 && (row + i) < length && (column + j) < width){
					count ++;
					value += M[row + i][column + j];
				}

			}
		}
		return value/count;
    }
}
