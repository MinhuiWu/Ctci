public class MergeTwoArray{
    /* Merge two sorted arrays, A with larger buffer to hold B.
     * time complexity : O(n),
     * space complexity: O(n)
     */
    public static void mergeTwoArray(int[] arrayA, int[] arrayB) {
        int indexA = arrayA.length - 1;
        int indexB = arrayB.length - 1;
        int indexMerged = indexA + indexB;
        
        while (indexB > 0) {
            if (arrayA[indexA] > arrayB[indexB] && indexA > 0) {
                arrayA[indexMerged] = arrayA[indexA];
                indexA--;
            } else {
                arrayB[indexMerged] = arrayB[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }  
    
    
    public static void main(String[] str) {
        int[] arrayA = {3,5,3,2,1,6,8,0,0,0,0};
        int[] arrayB = {4,7,9,2};
        mergeTwoArray(arrayA, arrayB);
        System.out.println(AssortedMethods.arrayToString(arrayA));
    }    
}
