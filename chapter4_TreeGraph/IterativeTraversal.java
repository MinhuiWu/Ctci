import java.util.Stack;


public class IterativeTraversal {
	
	public void preorder(TreeNode root){
		
		if(root == null) return ;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode current = stack.pop();
			if(current.right != null) stack.push(current.right);
			if(current.left != null) stack.push(current.left);
			System.out.print(current.data + " ");
		}		
	}
	
	
	
	public void inorder(TreeNode root){
		
		//if(root == null) return;		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(!stack.isEmpty() || root != null){
			if(root != null){
				stack.push(root);
				root = root.left;
			}else{
				root = stack.pop();
				System.out.print(root.data + " ");
				root = root.right;
			}						    			
		}		
	}
	
	
	
	public void postorder(TreeNode root){
		if(root == null) return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(!stack.isEmpty() || root != null){
			if(root != null){
				stack.push(root);
				root = root.left;
			}else{
				TreeNode peekNode = stack.peek();
				if(peekNode.right != null ){
					root = peekNode.right;
				}else{
					stack.pop();
					System.out.print(root.data +" ");
				}
					
			}
		}		
	}
	
	
}
