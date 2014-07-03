public class BinarySearch{
	//recursion solution
	public static boolean binarySearch(int[] array, int target){
		return binarySearchHelper(array, target, 0, array.length - 1);
	}
	
	public static boolean binarySearchHelper(int[] array, int target, int low, int high){
		if (low >= high)  return false;
		
		int mid = low + (high - low)/2; 
		
		if (target == array[mid]) {
			return true;
		} else if (array[mid] > target) {
			return binarySearchHelper(array, target, low, mid - 1);
		} else {
			return binarySearchHelper(array, target, mid + 1, high);
		}
	}
	
	
	
	//iterative solution
	public static boolean binarySearchIterative(int[] array, int target){
		if (array == null || array.length == 0)  return false;
		
		int low = 0;
		int high = array.length - 1;
		int mid = low + (high - low)/2; 
		
		while (low < high) {
			if (target == array[mid]) {
				return true;
			} else if (target > array[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5, 6, 7};
	    System.out.println(binarySearchIterative(array, 2));
	    System.out.println(binarySearch(array, 6));
	}
	
}
