import java.util.*;

public class AnagramSort{
    /* sort an array of strings so that all the anagrams are next to each other
     * {“abc”, “arce”, “cba”, “cera”} => {“abc”, “cba”, “arce”, “cera”}
     *
     * brute force solution: use array.sort(array) to sort the whole array elements
     * time complexity would be O(nlogn)
     *    
     * use the thinking of bucket sort, not to sort all elements in the array, but to group them 
     * we use hash table as counter, key is the sorted anagram, value is the linked list to be all the anagram strings.     
     */ 
    public void anagramSort(String[] array){
        if (array.length == 1 || array = null)  return;
        
        Hashtable<String, LinkedList<String>> result = new Hashtable<String, LinkedList<String>>();
        
        //put anagram strings in hashtable
        for(String string : array) {
            String key = string.sortChar(string);
            if (!result.containsKey(key) {
                result.put(key, new LinkedList<String>());
            } else {
                LinkedList<String> anagram = result.get(key);
                anagram.put(string);
            }
        }
        
        int i = 0;
        //covert hashtable elements into array
        for (String key : result.keySet()) {
            LinkedList<String> anagram = result.get(key);
            for (String string : anagram) {
                array[i] = string;
                i++;
            }
        }        
    }           
}
