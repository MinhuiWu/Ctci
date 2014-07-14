public class ContigousSum{
    /* find the contiguous sequence with the largest sum
     */    
    public static int contigousSum(int[] array) {
        int currentsum = 0;
        int maxsum = 0;
        for (int i = 0; i < array.length; i++) {
            currentsum += array[i];
            if (currentsum > maxsum) {
                maxsum = currentsum;
            } else if (currentsum < 0) {
                currentsum = 0;
            }
        }        
        return maxsum;
    } 
    
    public static void main(String[] args) {
    	int[] array = {2, -8, 3, -2, 4, -10};
    	System.out.println(contigousSum(array));
	}   
}
