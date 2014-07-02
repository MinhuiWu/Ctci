public class InorderSucc{
	/* find the in order traversal next successor in a BST(each node has a link to its parent)
	 * Solution
	 * 1) node have( both left child and) right child,
	 *    successor: right child’s left most child
	 * 2) node do not have right child, 
	 *    if has parent, and it is its parent’s left node: sucessor---> parent
	 *    if it is not its parent’s left node:  sucessor----->parent.parent
	 */	
	
	public TreeNode inorderSucc(TreeNode root, TreeNode node){
		if(root == null) return null;
		
		if(node.right != null) return leftMost(node.right);
		
		TreeNode x = node;
		TreeNode y = node.parent;
		while(y != null && y.left != x){
			x = y;
			y = y.parent;
		}
		return y;
	}
	
	
	public TreeNode leftMost(TreeNode node){
		if(node.left == null) return node;
		
		while(node.left != null){
			node = node.left;
		}
		return node;
	}
}
