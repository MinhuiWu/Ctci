import java.util.Stack


public class InorderSucc{
	/* find the in order traversal next successor in a BST(each node has a link to its parent)
	 */	
	
	public TreeNode inorderSucc(TreeNode root, TreeNode node){
		if(root == null) return null;
		
		if(node.right != null) return leftMost(node.right);
		
		TreeNode x = node;
		TreeNode y = node.parent;
		while(y != null && x.right == null){
			x = y;
			y = y.parent;
		}
		return y

	}
	
	public TreeNode leftMost(TreeNode node){
		if(node.left == null) return node;
		
		while(node.left != null){
			node = node.left;
		}
		return node;
	}
	
	
	
}
