public class SwapNumber{
    /* swap a number in place, without temporary variables
     */  
        
    public static void swap(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
    }      
    
    public static void swapOption(int a , int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
    }
    
    public static void main(String[] args) {
    	int a = 10;
    	int b = 22;

	  	swap(a, b);
    	swapOption(a, b);
		
    }
}
