public class CheckSubtree{
	/* check a million nodes binary tree, and a hundreds nodes binary tree, whether one is another's subtree
	 *
	 * hint: while the tree nodes number is very small, do just preorder and inorder search to see the output array
	 * another solution not need to compute the whole large tree: search from the larger tree find and compare with the small tree	
     */	
		
		
	public boolean checkSubtree(TreeNode rootOne, TreeNode rootTwo){
		if(rootOne == null) return false;
		
		//find the beginning node of the two tree that match
		if(rootOne.data == rootTwo.data) return checkHelper(rootOne, rootTwo);
		
		return checkSubtree(rootOne.left, rootTwo) || checkSubtree(rootOne.right, rootTwo);
		
	}
	
	public boolean checkHelper(TreeNode rootOne, TreeNode rootTwo){
		if(rootOne == null && rootTwo == null) return true;
		
		//check two tree from the beginning of the match node.
		if(rootOne.left != rootTwo.left || rootOne.right != rootTwo.right) return false;
		
		return checkHelper(rootOne.left, rootTwo.left) && checkHelper(rootOne.right, rootTwo.right);
		
	}	 	
}
