import java.util.ArrayList;

public class SumPath{
	/* print all the path which sum up to the given number
	 * recursivly go throught the tree, update the sum while pass from root to the leave
	 */
	//start from root, end anywhere	
	public static ArrayList<ArrayList<Integer>> sumPath(int sum, TreeNode root){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) return result;	
			
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(root.data);
		
		sumPathHelper(sum - root.data, root, result, list);
		
	}	
	
	
	public static void sumPathHelper(int sum, TreeNode root, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
		list = new ArrayList<Integer>();
		if (root == null) return;
		
		if (sum == 0) {
			result.add(list);
			return;
		}
	
		if (root.left != null){
			list.add(root.left.data);
			sumPath(sum-root.data, root.left, result, list);
			list.remove(list.size() - 1);
		}
			
		if (root.right != null){
			list.add(root.right.data);
			sumPath(sum-root.data, root.right, result, list);
			list.remove(list.size() - 1);
		}			
	}	
	
	
	
	
	
	
	//start anywhere
			
}
