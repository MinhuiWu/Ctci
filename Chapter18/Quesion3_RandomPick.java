public class RandomPick{
    /* randomly generate a set of m integers from an array of size n
     * one trick using here is to get random index for the new array not the original one,
     * for could not delete the chosen one from array    
     */    
    public static int getRandom(int lower, int higher) {
        return lower + (int)(Math.random() * (high - lower + 1));
    } 
    
    public static int randomPick(int[] arr, int n) {
        int[] result = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            int index = getRandom(0, m);
            if (index < m) {
                result[index] = arr[i];
            }  
        }
        
        return result;
    } 
}
