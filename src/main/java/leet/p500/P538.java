package leet.p500;

import leet.depend.TreeNode;

public class P538 {
    public TreeNode convertBST(TreeNode root) {
		
    	addGreater(root ,0);
    	
    	return root;
    }
    
    private int addGreater(TreeNode root ,int parent) {
		
    	if(root == null) {
    		return 0;  	
    	}
        int temp = root.val + addGreater(root.right ,parent);
    	root.val = parent + temp;
    	return temp + addGreater(root.left ,root.val); 	
    }
    
}
