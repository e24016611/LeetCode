package leet.p500;

public class P565 {
    
	public int arrayNesting(int[] nums) {
		
		int max = 0;
		int[] used = new int[nums.length] ;

		for(int i = 0 ;i<nums.length ;i++) {
			max = Math.max(max ,trace(nums ,i ,used));
		}
		
        return max;
    }
	
	private int trace(int[] nums ,int index ,int[] used) {
		if(used[nums[index]] == 1 || nums[index] == index) {
			return 0;
		}
		
		used[index] = 1;
		
		return 1 + trace(nums ,nums[index] ,used);
	}
	
}
