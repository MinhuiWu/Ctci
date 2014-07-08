public class InsertionSort{
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while ((j > -1) && (array[j] > temp)) {
                array[j + 1] = array[j];  
                j--;             
            }
            array[j + 1] = temp;
        }
        return array;
    }
    
    
    public static void main(String[] str) {
        int[] array = {3,5,3,2,1,6,8};
        int[] arrSorted = insertionSort(array);
        for(int i:arrSorted){
           System.out.print(i);
           System.out.print(", ");
        }
    } 
}
