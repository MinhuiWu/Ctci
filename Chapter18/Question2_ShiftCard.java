import java.util.*;

public class ShiftCards{
    //random number between lower and higher
    public static int random(int lower, int higher) {
        return lower + (int)(Math.random() * (higher - lower + 1));
    }
    
    //recursive way
    public static int[] shiftRecusive(int[] arr) {
        return shiftHelper(arr, arr.length);
    }
    
    public static int[] shiftHelper(int[] arr, int i) {
        if (i == 0)  return arr;
        
        //do shift from 0 to i-1
        shiftHelper(arr, i - 1);
        int index = random(0, i);
        
        //swap index
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
        
        return arr;
    }
    
    //iterative way
    public static int[] shiftIterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = random(0, i);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
