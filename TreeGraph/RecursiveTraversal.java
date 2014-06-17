
public class RecursiveTraversal {

	public void preorder(TreeNode root){
		
		if(root == null) return;
		System.out.print(root.data +" ");
		
		if(root.left != null) preorder(root.left);
		if(root.right != null) preorder(root.right);		
	}
	
	
	
	
	public void inorder(TreeNode root){
		
		if(root == null) return;
		
		if(root.left != null) inorder(root.left);
		System.out.print(root.data +" ");
		
		if(root.right != null) inorder(root.right);
	}
	
	
	
	public void postorder(TreeNode root){
		
		if(root == null) return;
		
		if(root.left != null) postorder(root.left);
		if(root.right != null) postorder(root.right);
		System.out.print(root.data + " ");
	}
}
