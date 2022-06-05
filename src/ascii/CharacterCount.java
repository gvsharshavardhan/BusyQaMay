package ascii;

public class CharacterCount {
    public static void main(String[] args) {
        String sentence = "learn java programming";
        int count[] = new int[128];

        //counting the occurances of each character
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            int ascii = ch;
            count[ascii]++;
        }

        //looping over array and printing the count on to the console.
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                char ch = (char)i;
                int c  = count[i];
                System.out.println(ch+" : "+c);
            }
        }
    }
}
