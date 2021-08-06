public class URLify {

    public char[] stringToUrl(char[] charArray, int stringLength) {

        // loop through char array, looking for spaces
        for(int i = 0;i<stringLength;i++) {


            // if space found
            if(charArray[i] == ' ') {
                // move right side of the array two more spaces to the right 
                charArray = shiftArray(charArray,i);
                // insert space chars
                charArray[i] = '%';
                charArray[i] = '2';
                charArray[i] = '0';
                i += 3;

            }

            // else
            }

        return charArray;
    }

    public char[] shiftArray(char[] charArray, int currIndex) {
        for(int lap = 0;lap<2;lap++) {
            for(int i = charArray.length; i>currIndex; i--) {
                charArray[i-1] = charArray[i-2];
            }
        }
        return charArray;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // assuming every char of string is a space for 'sufficient' space
        String str = "ab cd";
        Integer stringLength = str.length();
        char[] charArray = new char[stringLength*3+1]; 
         // loop through str and add chars to chararray
        for(int i = 0; i < stringLength;i++) {
            charArray[i] = str.charAt(i);
        }
        URLify obj = new URLify();
        System.out.println(obj.stringToUrl(charArray, stringLength));
    }
    
}
