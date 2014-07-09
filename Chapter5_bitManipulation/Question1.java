public class Question_1{
    /* input: N = 10000000000, M = 10011, i = 2, j = 6
     * output: N = 10001001100 
     * insert M into N start at bit j and ends at bit i.
     * 1) clear bits in N from i to j 
     * 2) set bit from i to j                  
     */
    public static int updateBits(int m, int n, int i, int j) {
        if (i > j || i > 32)  return -1;
        
        int allOne = ~0;//get 11111111
        
        int tmpleft = allOne >> (j + 1); // tmpleft = 11110000000; 
        int tmpright = (allOne << i) - 1; // tmpright = 00000000011;
        int mask = tmpleft | tmpright; //mask = 11110000011;
        
        int tmp = n & mask; 
        int tmpM = m << i;
        
        int result = tmp | tmpM;
        return result;
        
    }
    
}
