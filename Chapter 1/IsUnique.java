import java.util.HashMap;

public class IsUnique {

    /* This is my first java program.
     * This will print 'Hello World' as the output
     */

     public Boolean isStringUnique(String str) {
        boolean uniqueness = true;
        int i = 0;
        
        // construct hashmap
        HashMap<Character, Integer> stringMap = new HashMap<Character, Integer>();
        // loop through string
        while(uniqueness == true && i < str.length()) {
           // check to see if there has already been current char inserted
           char currChar = str.charAt(i);
           try{ 
              // if collision, uniqueness = false
              int temp = stringMap.get(currChar);
              System.out.println("Is Not Unique");
              uniqueness = false;
           }
           catch(NullPointerException e) {
              // else, char is still unique so we enter into hashmap and continue
              System.out.println("Is Unique");
              stringMap.put(currChar,1);
           }
           i += 1;
        }

        return uniqueness;
     }
 
    public static void main(String []args) {
       IsUnique obj = new IsUnique();
       System.out.println(obj.isStringUnique("accedgh")); // prints Hello World
    }
 }