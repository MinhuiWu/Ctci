public class CommonAncestor{
	/* find the common ancestor of two nodes
	 *
	 * solution A top down method(without its link to the node's parent):
	 * see whether the two nodes are on the same side, left/right, then go left of right to find the common ancestor	
	 * if both nodes are on different side, then find the common ancestor	
	 *	
	 *			
	 * 1) if one node is the root of the other node's tree, then the node itself is the ancestor
	 * 2) go bottom up to see if the other node is in one node's parent's node's subtree		
	 */	
	//solutionA	
	public static TreeNode commonAncestor(TreeNode root, TreeNode node_one, TreeNode node_two){
		if(root == null) return null;
		if(!cover(root, node_one) || !cover(root, node_two)) return null;//one of the nodes is not in the tree
		
		if(cover(root.left, node_one) != cover(root.left, node_two) && cover(root.right, node_one) != cover(root.right, node_two)){
			return root;
		}
		
		TreeNode child = cover(root,left, node_one) ? root.left : root.right;
				return commonAncestorHelper(child, p, q);
		
	}
	
	
	public static boolean cover(TreeNode root, TreeNode node){
		if(root == null) return true;
		if(root == node) return true;
		
		return cover(root.left, node || root.right, node);
	}
	
	
	
	
	//solution B(could not test one condition while one node is not in the tree)
	public static TreeNode commonAncestor(TreeNode root, TreeNode node_one, TreeNode node_two){
		if(root == null) return null;
		
		if(root == node_one || root == node_two) return root;
		
		//search left side while the LCA is on the left side
		TreeNode bufferLeft = commonAncestor(root.left, node_one, node_two);
		if(bufferLeft != node_one && bufferLeft != node_two){
			return bufferLeft;
		}
		
		//search right side while the LCA is on the right side
		TreeNode bufferRight = commonAncestor(root.right, node_one, node_two);
		if(bufferRight != node_one && bufferRight != node_two){
			return bufferRight;
		}
		
		
		if(bufferLeft != null && bufferRight != null){
			return root;
		}else{
			return bufferLeft == null ? bufferRight: bufferLeft;
		}
	}	
	
}
