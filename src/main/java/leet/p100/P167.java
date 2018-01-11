package leet.p100;

public class P167 {
    public int[] twoSum(int[] numbers, int target) {
        
    	
    	for(int i = 1; i <= numbers.length; i++) {
    		int index = binarySearch(numbers, (target - numbers[i-1]));
    		if(index != -1 && index != i) {
    		    if(i > index)
                    return new int[] {index ,i};
    		    else
    		    	return new int[] {i ,index};
    		}
    	}
    	throw new IllegalArgumentException("No two sum solution");    	

    }
    
    public int binarySearch(int[] numbers ,int search) {
    	int result = -1;
    	int start = 0, end = numbers.length-1;
    	
    	while(start <= end) {
    		int mid = (start + end)/2;
    		if(search > numbers[mid]) {
    			start = mid + 1;
    		}else if(search < numbers[mid]){
    			end = mid - 1;
    		}else if(search == numbers[mid]){
    			result = mid+1;
    			break;
    		}
    	}
    	
    	
    	return result;
    }
}
