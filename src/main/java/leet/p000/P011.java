package leet.p000;

public class P011 {
    public int maxArea(int[] height) {
        
        int maxArea ,start ,end ; 
        
        maxArea = 0;
        start = 0;
        end = height.length - 1;
        
        while(start < end){
         
            maxArea = Math.max(maxArea ,Math.min(height[start] ,height[end])*(end - start));
            
            if(height[start] > height[end]){
                end --;
            }else{
                start++;
            }
            
        }
        return maxArea;
        
    }
}
