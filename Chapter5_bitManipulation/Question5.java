public class Question5{
    /* determine the number of bits required to convert interger A to B
     */        
    public int bitChange(int a, int b) {
        int count = 0;
        int temp = a ^ b;
        while (temp != 0 && (temp & 1 == 1) {
            temp = temp >> 1;
            count++;
        }
        return count;
    }    
}
