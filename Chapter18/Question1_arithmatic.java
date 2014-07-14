public class Arithmatic{
    /* not use +, -, *, / to implement arithmatic (add without arithmatic operator) 
     */
    public static int add(int a, int b) {
        if (b == 0)  return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return add(sum, carry);
        
    } 
    
    
    public static int subtract(int a, int b) {
        b = add(~b, 1);
        return add(a, b);
    }   
    
    
    public static int multiply(int a, int b) {
        int sum = 0;
        int shiftBit = 1;
        
        while ((shiftBit & b) <= a) {
            if ((shiftBit & b) > 0) {
                sum = add(a, sum);
            }
            shiftBit <<= 1;            
            a <<= 1;
        }
        return sum;    
    }   
    
    /*
    public static int division(int a, int b) {
        
    } 
    */
    
    public static void main(String[] str) {
        int a = 32;
        int b = 15;
        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
    }
}
