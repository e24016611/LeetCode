import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {

		LinkedList<Integer> keys = new LinkedList<Integer>();
		Map<Integer ,Integer> keyValue = new HashMap<Integer ,Integer>();
		int capacity = 0;
		
	    public LRUCache(int capacity) {
	    	this.capacity = capacity;
	    }
	    
	    public int get(int key) {
	    	if(keyValue.containsKey(key)){
                int index = keys.indexOf(key);
                keys.remove(index);
                keys.add(key);
	    	    return keyValue.get(key);
	    	}
	    	else{
	    		return -1;
	    	}
        }
	    
	    public void put(int key, int value) {
            if(!keyValue.containsKey(key)){
                if(keys.size() == capacity){
                    int remove = keys.poll();
                    keyValue.remove(remove);
                }
                keys.add(key);
            }else{
                int index = keys.indexOf(key);
                keys.remove(index);
                keys.add(key);
            }
	        
	        keyValue.put(key, value);
	    }
	}
