import java.util.HashMap;
public class PalindromePermutation {
    // 6:47

    public boolean isPalindromPerm(String str) {
        int oddCounter = 0;
        // convert to hashmap 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i<str.length(); i++) {
            char curr = str.charAt(i);

            // Check for collision 
            // if contains, set value to v+=1
            if(map.containsKey(curr)) {
                map.put(curr,map.get(curr)+1);

            }
            // else, value = 1
            else {
                map.put(str.charAt(i), 1);
            }
        }
        // iterate through keys, if there is at most one value that is odd, than bool = true
        for(Integer val: map.values()) {
            if(val%2 != 0) {
                oddCounter += 1;
            }
            if(oddCounter >1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        PalindromePermutation obj = new PalindromePermutation();
        System.out.println(obj.isPalindromPerm("darar"));
    }
    
}
