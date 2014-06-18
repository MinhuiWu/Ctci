import java.util.ArrayList;
import java.util.LinkedList;

public class CreateLevelLinkedList{
	/* binary Tree, create a linkedlist of all the nodes at a each depth
	 *
	 *	BFS: each level print out as linkedlist(iterative method):using queue
	 *  DFS: track each level of the nodes, pre-order traversal	(recursive method/ iterative method: using stack)
	 */		
	
	
	//BFS using iterative method	
	public ArrayList<LinkedList> createLevelLinkedList_BFS(TreeNode root){
		ArrayList<LinkedList<TreeNode> result = new ArrayList<LinkedList>();
		
		//visit the root node 
		LinkedList<TreeNode> levelList = new LinkedList<TreeNode>();
		if(root != null) levelList.add(root);//base case
		
		while(levelList.size() > 0){
			//add previous level
			result.add(levelList);
			//add the next level-->go to its child
			LinkedList<TreeNode> parents = levelList;
			levelList = new LinkedList<TreeNode>();
			
			for(TreeNode parent : parents){
				//visit the children of the last level
				if(parent.left != null){
					levelList.add(parent.left);
				}
				if(parent.right != null){
					levelList.add(parent.right);
				}
			}
			
		}
		
		return result;		
	}
	
	
	//BFS using iterative method, using an queue to store visited nodes,
	public ArrayList<LinkedList<TreeNode>> createLevelLinkedList_BFS(TreeNode root){
		if(root == null) return null;
		ArrayList<LinkedList> result = new ArrayList<LinkedList>();
		
		Queue<TreeNode> level = new LinkedList<TreeNode>();
		level.add(root);
		while(level != isEmpty()){
			TreeNode current = level.poll();
			result.add(current);
			if(current.left != null){
				level.add(current.left);
			} 
			if(current.right != null){
				level.add(current.right);
			}	
		}
		return result;
		
	}
	
	
	
	//DFS using recursive method
	public ArrayList<LinkedList<TreeNode>> createLevelLinkedList_DFS(TreeNode root){
		if(root == null) return null;
		
		ArrayList<LinkedList<TreeNode> lists = new ArrayList<LinkedList<TreeNode>();
		createLevelLinkedListHelper(result, 0, root);
		return lists;
	}
	
	public void createLevelLinkedListHelper(ArrayList<LinkedList<TreeNode> lists, int level, TreeNode root){
		LinkedList<TreeNode> list = null;
		
		if(list.size() >= level){
			list = new LinkedList<TreeNode>();
			lists.add(list);
		}else{
			list = lists.get(level);
		}
		
		list.add(root);
		createLevelLinkedListHelper(lists, level+1, root.left);
		createLevelLinkedListHelper(lists, level+1, root.right);
				
	}	
}
