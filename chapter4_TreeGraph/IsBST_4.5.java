public class IsBST{
	/* check whether a binary tree is a BST
	 * 
	 * 1) recursively check whether the right is larger than the root and the left is smaller than the root	
	 *	  in-order traversal, get the array should be in ordered.	
	 * 2) use max/min value solution 
	 *	  every node has a value interval[min/leftnode, max/rightnode]	
	 */
		
	//in order traversal model(use a static member to record previous value, in order to be remembered during recursion timed)
	public static int previous = Integer.MIN_VALUE;
	public boolean isBST(TreeNode root) {
		if (root == null)  return true;
		 
		//left side
		if (!isBST(root.left))  return false;
		
		//current
		if (root.data <= previous)  return false;
		previous = root.data;
		
		//right side
		if (!isBST(root.right))  return false;	
		
		return true;		
	} 
	
	
	//MAX MIN VALUE method
	public boolean isBST(TreeNode root){
		if (root == null)  return true;
		return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	} 
		
	public boolean isBSThelper(TreeNode root, int max, int min){
		if (root.data > max || root.data < min)  return false;
		 
		if (root.left.data > root.data)  return false;
		
		if (root.right.data < root.data)  return false;
		  
		if (!isBSThelper(root.left, root.data, min) || !isBSThelper(root.right, max, root.data)) {
			return false;
		}
		return true;
	}
	
}	
