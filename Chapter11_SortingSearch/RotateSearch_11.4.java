public class RotateSearch{
    /* Given a sorted array of n integers been rotated unknow number of times. find the target in the array 
     * solution:
     * do binary search, either the left halve or the right halve would be in normal order, 
     * then the other part would be rotated order 
     * one special case would be that when the array have duplicate elements, for example: 2,2,2,2,4,5,1           
     */ 
        
    public static boolean rotateSearch(int[] array, int target) {
        if (array == null) return false;
        return rotateSearchHelper(array, target, 0, array.length - 1);
    }
    
    
    public static boolean rotateSearchHelper(int[] array, int target, int low, int high) {
        int mid = low + (high - low)/2;
        if (low < high)  return false;
        //the target is found
        if (target == array[mid])  return true; 
         
            
        if (array[mid] > array[low]) {
            // the left halve is normal
            if (target <= array[mid] && target >= array[low]) {
                return rotateSearchHelper(array, target, low, mid - 1);
            } else {
                return rotateSearchHelper(array, target, mid + 1, high);
            }
        }
        
        
        if (array[mid] < array[high]) {
            //the right halve is normal
            if (target >= array[mid] && target <= array[high]) {
                return rotateSearchHelper(array, target, mid + 1, high);
            }  else {
                return rotateSearchHelper(array, target, low, mid - 1);
            }
        }
        
        
        if (array[low] == array[mid]) {
            //left halve is the same
            if (array[mid] != array[high]) {
                //right halve is different
                return rotateSearchHelper(array, target, mid + 1, high);
            } else {
                //search both halves
                boolean result = rotateSearchHelper(array, low, mid - 1, target); 
                if (!result)  return rotateSearchHelper(array, mid + 1, high, target); 
                return result;
            }
        }
        return false;        
    } 
    
    
	public static void main(String[] args) {
	    int[] array1 = {10,15,20,0,5};
        int[] array2 = {50,5,20,30,40};
        int[] array3 = {2,2,2,4,6,1,2};
	    System.out.println(rotateSearch(array1, 15));
	    System.out.println(rotateSearch(array2, 6));
	}
    
    
    
        
}
