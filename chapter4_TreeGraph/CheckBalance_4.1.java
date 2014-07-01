public class CheckBalance{
	/* Implement a function to check if a tree is balanced.
	 *
	 * check the height of every leaf node to see whether(could stop travesal the tree after the tree is not balanced) 	
	 * An empty tree is height-balanced. A non-empty binary tree T is balanced if:
		1) Left subtree of T is balanced
		2) Right subtree of T is balanced
		3) The difference between heights of left subtree and right subtree is not more than 1.
	 * This ensures that operations on the tree are always guaranteed to have O(lg n) time, rather than O(n) time that they might have in an unbalanced tree.	
	 */
	public int checkHeight(TreeNode root){
		//check left
		leftHeight = checkHeight(root.left);
		if(leftHeight = 0){
			return 0;
		}
		
		//check right
		rightHeight = checkHeight(root.right);
		if(rightHeight = 0){
			return 0;
		}
		
		if(Math.abs(leftHeight - rightHeight) > 1){
			return 0;//not balance
		}else{
			return Math.max(leftHeight, rightHeight)+1;
		}
				
	}	
		
	
	
		
	public static boolean checkBalance(TreeNode root){
		if(root == null) return true;// empty tree is balanced
			
		if(checkHeight(root) == 0){
			return false;
		}else{
			return true;
		}
	}	
}
