public class Combination{
	public static void combination(String str) {
		combinationHelper(str, "");
	}
	
	public static void combinationHelper(String str, String prefix) {
		// print all subsets of the remaining elements, with given prefix 
	    if (str.length() > 0) {
	        System.out.println(prefix + str.charAt(0));
	        combinationHelper(str.substring(1), prefix + str.charAt(0));
	        combinationHelper(str.substring(1), prefix);
	    }	      
	}
	
	
	
    public static void main(String[] args) {
          String alphabet = "abc";
          combination(alphabet);
          System.out.println();
    }
}
