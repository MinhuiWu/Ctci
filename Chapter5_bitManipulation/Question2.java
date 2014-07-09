public class Question2{
    /* a real number between 0 and 1, passed in as a double, print the binary representation. 
     * if cannot be represented accurately in binary with at most 32 character, print ERROR
     * Non-integer number in binary : (between 0~1)
     * decimal number
     * 0.101 = 1 * (1/2) + 0 * (¼) + 1*(⅛);
     * when print the decimal part, multiply by 2 and check if 2n is greater than or equal to 1.
     * this is essentially shifting the fractional sum.
     * use string builder to append every digit of the number.    
     */
        
    public static String doubleBinary(double num) {
        if (num > 1 || num < 0)  return "ERROR";
        
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (sb.length > 32)  return "ERROR";
            int tmp = num * 2;
            
            if (tmp > 1) {
                sb.append(1);
                num = tmp - 1;
            } else {
                sb.append(0);
                num = tmp;
            }
            sb.append(.);
        }
        
        return sb.toString;
    }            
}
