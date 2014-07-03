public class MagicIndex{
	/* find the index that A[i] = i from a sorted array of distinct integers
	 * like the binary search for a sorted array.
	 * compare middle of the array A[mid] with mid, then shift left or right
	 *	
	 * Follow up: for the array integers are not distince	
	 * needs to search for the right and also left after compare A[mid] with the mid	
	 */
			
	//for the elements in the array is distinct	
	public static int magicIndex(int[] array) {		
		return magicIndexHelper(array, array.length - 1, 0);
	}
	
	public static int magicIndexHelper(int[] array, int high, int low) {
		if (high < low)  return -1;
		int mid = low + (high - low)/2;
		
		if (array[mid] == mid) {
			return mid;
		} else if (array[mid] < mid) {
			return magicIndexHelper(array, high, mid + 1);
		} else {
			return magicIndexHelper(array, mid - 1, low);
		}		
	}	
	
	
	
	//for the elements in the array is not distinct
	public static int magicDup(int[] array) {
		return magicDupHelper(array, array.length - 1, 0);
	}
	
	public static int magicDupHelper(int[] array, int high, int low) {
		if (high < low)  return -1;
		int mid = low + (high - low)/2;
		
		if (array[mid] == mid) {
			return mid;
		}
		
		
		int leftIndex = Math.min(mid - 1, array[mid]);
		int left = magicDupHelper(array, leftIndex, low);
		if (left >= 0) {
			return left;
		}

		/* Search right */
		int rightIndex = Math.max(mid + 1, array[mid]);
		int right = magicDupHelper(array, high, rightIndex);

		return right;
		
	}
	
	
	
	public static void main(String[] str) {
		int[] array = {1,3,4,6,7,9};
		int[] arrayDup = {-10,5,2,2,2,3,4,7,9};
		System.out.println(magicIndex(array));
		System.out.println(magicDup(arrayDup));
	}
}
