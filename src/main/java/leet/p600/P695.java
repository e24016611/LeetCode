package leet.p600;

public class P695 {
	
	int[][] map ;
	
    public int maxAreaOfIsland(int[][] grid) {

    	map = grid ;
    	int result = 0 ;
    	
    	for(int i = 0;i < map.length;i++){
    		for(int j = 0;j < map[i].length;j++){
    			if(map[i][j] == 1){
    				result = Math.max(result, findLand(i ,j));
    			}
    		}
     	}
    	
    	return result;
    }
    
    public int findLand(int i,int j){
    	

    	if(i >= map.length || j >= map[0].length || i < 0 || j < 0){
    		return 0;
    	} else if (map[i][j] == 0){
    		return 0;
    	}
    	
    	int island = map[i][j];
    	map[i][j] = 0;
    	
    	return findLand(i-1 ,j) + findLand(i ,j-1) + findLand(i ,j+1) + findLand(i+1 ,j) + island;
   	
    }
    
    
}
