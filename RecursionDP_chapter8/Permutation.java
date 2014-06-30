public class Permutation{
	//recursive solution
	public static void permu1(String str){
		permu1Helper(str, "");
	}
	
	public static void permu1Helper(String str, String prefix){
		int length = str.length();
		if (length == 0)  System.out.println(prefix); 
		for (int i = 0; i < length; i++){
			permu1Helper(str.substring(0, i) + str.substring(i + 1,  length), prefix + str.charAt(i));
		}
	}
	
	
	//use swap 
	public static void permu2(String str){
		int length = str.length();
		char[] charArray = new char[length];
		for (int i = 0; i < length; i++) {
			charArray[i] = str.charAt(i);
		}	      
		permu2Helper(charArray, length);
	}
	
	
	public static void permu2Helper(char[] charArray, int length){
		if (length == 1) {
			//terminate case
		    System.out.println(charArray);
		    return;
		}
		for (int i = 0; i < length; i++) {
			swap(charArray, i, length - 1);
			permu2Helper(charArray, length - 1);
			swap(charArray, i, length - 1);
		}
		
	}
	
	
	
	
    private static void swap(char[] a, int i, int j) {
        char c;
        c = a[i];
		a[i] = a[j]; 
		a[j] = c;
       }
	
	
	
	
	// use swap and dfs 
	//public 
	
	
	
	
    public static void main(String[] args) {
          String alphabet = "abc";
          permu1(alphabet);
          System.out.println();
          permu2(alphabet);
		  System.out.println();
    }
	
}
