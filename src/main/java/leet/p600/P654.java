package leet.p600;

import java.util.Arrays;

import leet.depend.TreeNode;

public class P654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        int max = 0 ,index = 0;
        
        for(int i = 0 ;i < nums.length ;i++){
        	if(nums[i] > max){
        		max = nums[i];
        		index = i;
        	}
        }
        
        TreeNode root = new TreeNode(max);
        root.left = (index == 0)?null
        		:constructMaximumBinaryTree(Arrays.copyOf(nums, index));
        root.right = (index == nums.length-1)?null
        		:constructMaximumBinaryTree(Arrays.copyOfRange(nums, index+1, nums.length));
        
        
        return root;
    }

}
