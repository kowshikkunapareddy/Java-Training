package interviewProgrames;

public class Palandrome {
    public static void main(String[] args) {

        String word = "Malayalam";
       String temp ="";
       String word1=word.toLowerCase();

       // Palindrome logic
        for (int i=word1.length()-1; i>=0; i--){

            temp = temp + word1.charAt(i);

        }
        System.out.println(temp);

        if (temp.equals(word1)){
            System.out.println("the word is Palindrome");
        }
        else {
            System.out.println("the word is not palindrome");
        }
    }

}
