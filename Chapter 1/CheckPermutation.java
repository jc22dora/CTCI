import java.util.HashMap;

public class CheckPermutation {

    public boolean isPermutation(String str1, String str2) {
        boolean bool = false;

        // instantiate str1 hash map
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

        // instantiate str2 hash map
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        // loop through strings to fill maps
        for(int i = 0;i<str1.length();i++) {

            char curr = str1.charAt(i);

            // Check for collision 
            // if contains, set value to v+=1
            if(map1.containsKey(curr)) {
                map1.put(curr,map1.get(curr)+1);

            }
            // else, value = 1
            else {
                map1.put(str1.charAt(i), 1);
            }
            

        }
        for(int i = 0;i<str2.length();i++) {

            char curr = str2.charAt(i);

            // Check for collision 
            // if contains, set value to v+=1
            if(map2.containsKey(curr)) {
                map2.put(curr,map2.get(curr)+1);

            }
            // else, value = 1
            else {
                map2.put(curr, 1);
            }
            

        }

        // compare hashmaps
        if(map1.equals(map2)) {
            bool = true;
        }

        // this is because a string will be a permutation of any other string that
        // has the same characters and the same amount of characters. 

        return bool;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        CheckPermutation obj = new CheckPermutation();
        System.out.println(obj.isPermutation("abcd","dab"));
    }
    
}
