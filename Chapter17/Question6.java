public class UnsortedSequence{
    /* find indice m and n that if u sorted m through n, the entire array would be sorted(minimize m - n)
     * 1) find the rightmost index of the left sorted array and the leftmost index of the right sorted array 
     * 2) then compare the left/right one with the mid unsorted array,
     * find min of the mid array > arrayleft, max of mid array < arrayright   
     */
    public static int leftIndex(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1])  return i-1;
        }
        return array.length - 1;
    }  
    
    public static int rightIndex(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i-1])  return i-1;
        }
        return 0;
    }
    
    public static int leftShift(int[] array, int left) {
        for (int i = left - 1; i > 0; i--) {
            if (array[left] > array[i])  return i;
        } 
        return 0;
    }
    
    public static int rightShift(int[] array, int right) {
        for (int i = right + 1; i < array.length - 1; i++) {
            if (array[right] < array[i])  return i;
        }
        return array.length - 1;
    }
    
    
    public static void unsorted(int[] array) {
        int left = leftIndex(array);
        int right = rightIndex(array);
        
        int minindex = left + 1;
        if (minindex >= array.length) return;// sorted array
        
        int maxindex = right - 1;
        for (int i = left; i <= right; i++) {
            if (array[i] < array[minindex])  minindex = i;
            if (array[i] > array[maxindex])  maxindex = i;
        }
        
        int leftindex = leftShift(array, minindex);
        int rightindex = rightShift(array, maxindex);
        
        System.out.println(leftindex + "to" + rightindex);
                
    }
    
    
    public static void main(String[] str) {
        int[] array = {1, 2, 4, 7, 10, 11, 8, 12, 5, 7, 16, 18, 19};
        unsorted(array);
    }
              
}
