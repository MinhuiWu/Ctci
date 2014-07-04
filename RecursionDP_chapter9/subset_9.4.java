import java.util.ArrayList;
import java.util.*;

public class Subset{
	/* return subset of a set
	 * recursion solution: 
	 * recursive case: generate P(n) from P(n-1), it comes for clone the P(n-1) subset, and add an to each subset of P(n-1)
	 * time complexity: 2^n
	 *		
	 */	
	/*	
	public static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> set) {
		return subsetHelper(set, 0);
	}
	
		
	public static ArrayList<ArrayList<Integer>> subsetHelper(ArrayList<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> levelset = new ArrayList<Integer>();
				
		if (set.size() == index) {
			result.add(levelset);//base case, empty set
		} else {
			result = subsetHelper(set, index + 1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			
			for (ArrayList<Integer> levelset : result) {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(levelset);
			}
			result.addAll(levelset);
		}
		return result;		
	}
	*/
	
	public static void main(String[] str) {
		/* ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < 3; i++) {
				list.add(i);
			}
			ArrayList<ArrayList<Integer>> subsets = subset(list);
			System.out.println(subsets.toString());
		*/	
			int[] set = {1,22,3,20};
			System.out.println(subsets(set));
	}
	
	
	
	public static ArrayList<ArrayList<Integer>> subsets(int[] set) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> line = new ArrayList<Integer>();
		Arrays.sort(set);
		subsetsHelper(set, 0, result, line);
		return result;
	}
	
	
	public static void subsetsHelper(int[] set, int level, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> line) {
		result.add(new ArrayList<Integer>(line));
		
		for (int i = level; i < set.length; i++) {
			//take this element
			line.add(set[i]);
			subsetsHelper(set, level + 1, result, line);
			//do not take this element
			line.remove(line.size() - 1);
		}
	}	
	
}
