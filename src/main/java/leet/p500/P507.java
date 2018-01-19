package leet.p500;

import java.util.HashSet;
import java.util.Set;

public class P507 {
    public boolean checkPerfectNumber(int num) {
        
        int total = 0 ;
        Set<Integer> divisors  = new HashSet<Integer>();
        divisors.add(1);
        for(int i = 2 ;i <= Math.sqrt(num) ;i++){

        	if( (num % i) == 0){
            	divisors.add(i);
            	divisors.add(num/i);
            	total += (i+num/i);
            }
        }
        if(total != num || num <= 2){
        	return false;
        }else{
        	return true;
        }
        
    }
}
