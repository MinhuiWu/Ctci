public class SearchEmptyStr{
    /* sorted array of strings which is interspersed with empty strings.
     */ 
    public boolean searchEmptyStr(String[] array, String target) {
        if (array == null || target == null || target.isEmpty())  return false;
        return searchHelper(array, target, 0, array.length - 1);
    } 
    
    
    public boolean searchHelper(String[] array, String target, int left, int right) {
        if (left > right)  return false;
        
        int mid = left + (right - left)/2;
        
        while (array[mid].isEmpty()) {
            //mid string is empty, find the nearest to mid nonempty string
            int leftend = mid - 1;
            int rightstart = mid + 1;
            if (leftend < left && rightstart > right) {
                return false;
            } else if (rightstart < right && !array[rightstart].isEmpty()) {
                mid = rightstart;
            } else if (leftend > left && !array[leftend].isEmpty()) {
                mid = leftend;
            } else {
                leftend--;
                rightstart++;
            }           
        }
        
        
        if (target.compareTo(array[mid]) == 0) {
            return true;
        } else if(target.compareTo(array[mid]) == -1) {
            return searchHelper(array, target, mid + 1, right);
        } else {
            return searchHelper(array, target, left, mid - 1);
        }     
    } 
}
