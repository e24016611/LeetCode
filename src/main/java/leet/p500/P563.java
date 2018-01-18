package leet.p500;

import leet.depend.TreeNode;

public class P563 {
    public int findTilt(TreeNode root) {

    	return findSub(root).tilt;
    	
    }
    public Temp findSub(TreeNode root){
		
        if(root != null){
	    	Temp left = findSub(root.left);
	    	Temp right = findSub(root.right);
	    	return new Temp((Math.abs(left.total - right.total) + left.tilt + right.tilt) ,(left.total + right.total + root.val));
    	}else{
    		return new Temp(0 ,0);
    	}
    }
    
    class Temp{
    	Temp(int tilt ,int total){
    		this.tilt = tilt;
    		this.total = total;
    	}
    	public int tilt;
    	public int total;
    }
    
    // better code
    
    private class Solution {
        int tilt=0;
       public int findTilt(TreeNode root) {
           traverse(root);
           return tilt;
       }
       public int traverse(TreeNode root)
       {
           if(root==null )
               return 0;
           int left=traverse(root.left);
           int right=traverse(root.right);
           tilt+=Math.abs(left-right);
           return left+right+root.val;
       }
    }
}


