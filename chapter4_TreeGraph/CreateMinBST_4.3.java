import java.util.Arrays;

public class CreateMinBST{
	/* Given a sorted array to create a BST with minimal height
	 * 1) get the middle of the array and make it root		
	 * 2) recursively do same for the left side and right side
	 *		get the middle of the left(right) half and make it the root for the left(right) half
	 */
		
	public static TreeNode createMinBST(int[] array){
		return createMinBST(array, 0, array.length - 1);
	}			
	
	public static TreeNode createMinBST(int[] array, int start, int end){
		if(start > end) return null;
		
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(array[mid]);
		root.setLeft(createMinBST(array, start, mid - 1));
		root.setRight(createMinBST(array, mid + 1, end));	
		return root;	
	}
	

	
	
	public static void main(String[] args) {
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

			createMinBST(array);
			//System.out.println("BST in pre order : ");      
			//System.out.println(PreOrderTraversal(createMinBST(array,0,array.length-1)));
		}
}
