public class SelectionSort {    
    /* Go through the array to find the element with the smallest key, swap with the first element, recursively repeated
     */  
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            swap(array, minPos, i);
        }
        return array;
    }   
    
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }  
    
        
    public static void main(String[] str) {
        int[] array = {3,5,3,2,1,6,8};
        int[] arrSorted = selectionSort(array);
        for(int i:arrSorted){
           System.out.print(i);
           System.out.print(", ");
        }
    } 
}
