public class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode root;
	
	public TreeNode(int data){
		this.data = data;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
	
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	} 
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int height(TreeNode root){
		int heightLeft = root.left != null ? left.height : 0;
		int heightRight = root.right != null ? right.height : 0;
		return Math.max(heightLeft, heightRight) + 1; 
	}	
		
}
