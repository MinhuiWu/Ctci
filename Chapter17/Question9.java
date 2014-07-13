import java.util.*;

public class GetFrenquence{
    /* find the frequency of occurrences of any given word in a book
     * create a hash table to use as the key value pair as counter    
     */    
    public int getFrenquence(String[] book, String word) {
        if (book == null || word == null)  return -1;
        
        Hashtable<String, Integer> bookString = new Hashtable<String, Integer>();
        
        //int count = 1;
        //put all the string of the book in the hashtable
        for(String str: book) {
            str = str.toLowerCase();
            if (!bookString.containsKey(str)) {
                bookString.put(str,1);
            } else {
                bookString.put(str, bookString.get(str) + 1)
            }
        }
        
        word = word.toLowerCase();
        if (bookString.containsKey(word))  return bookString.get(word);
        
        return 0;
    }    
}
