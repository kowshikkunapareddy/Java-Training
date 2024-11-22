package strings;

public class Assigment4 {

    // Count the Char A
    public static void main(String []args) {
        String MI8 = "our lives are not defined by any one action, our lives sum of our choices";
        int count = 0;

        for (int i = 0; i < MI8.length(); i++) {

            if (MI8.charAt(i) == 'o') {
                count++;
            }
        }

        System.out.println("Total number of 'O's in the string: " + count);
    }

    }


