package reversestring;

public class StringReverse {
    public static void main(String[] args) {
        String word = "harsha";
        char[] word_charray = word.toCharArray();
        for(int i=0;i<word_charray.length/2;i++){
            char c = word_charray[i];
            word_charray[i] = word_charray[word_charray.length-i-1];
            word_charray[word_charray.length-i-1] = c;
        }
        System.out.println("Reverse String: " + String.valueOf(word_charray));
    }

}
