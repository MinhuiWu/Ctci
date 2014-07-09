public class Question3{
    /* Given a positive integer, print the next smallest and the next largest number
     * that have the same number of 1 bits in their binary representation
     * 
     * Next Big:
     * 1) get the rightmost continuous non1 bit to 1
     * 2) then shift all continuous 1 bits to the right most   
     * !!!!!!if the input is 1111110000000, there would be no bigger number    
     * Previous Small:
     * 1) get the rightmost continuous zero bits, turned to zero
     * 2) put all numbers of right most bit one next to turned zero bit  
     * !!!!!!!!if the input is 000000111111, there would be no smaller number                       
     */
    public int nextBig(int n) {
        int temp = n;
        int count1 = 0; //the number of zeros to the right of n
        int count2 = 0; //the number of ones to the right of n
        
        while (temp != 0 && (temp & 1 == 0) {
            temp = 1 >> temp;
            count1++;
        }
        
        while (temp & 1 == 1) {
            count2++;
            temp = 1 >> temp;
        }
        
        
        if (count1 + count2 == 31 || count1 + count2 == 0) {
            return -1;
        }
        
        int position = count1 + count2; // right most continuous non1 bit 
        n = n | (1 << position); //step 1)
        n = n & ~((1 << position) - 1); // clear all bits to the right of position
        n = n | (1 << (count1 - 1)) - 1; // insert (count - 1) ones on the right
        return n;        
    }
    
    
    
    public int previousSmall(int n) { 
        int temp = n;
        int count1 = 0;
        int count2 = 0;
        int allone = ~0;
        
        while (temp & 1 == 1) {
            temp = 1 >> temp;
            count1++;
        }
        
        while (temp != 0 && (temp & 1 == 0)) {
            count2++;
            temp = 1 >> temp;
        }
        
        int position = count1 + count2;
        n = n & ((allone) << (position + 1));//clear all bits to the right of the position
        int mask = (1 << (count1 + 1)) - 1;
        n = n | mask << (count2 - 1);
        
        return n;
    }        
}
