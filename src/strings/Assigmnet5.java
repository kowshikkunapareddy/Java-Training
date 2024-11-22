package strings;

public class Assigmnet5 {
    public static void main(String[] args) {


        String MI8 = "our lives are not defined by any one action, our lives sum of our choices";
        String reverse ="";

        for (int i = MI8.length() - 1; i >= 0; i--) {

            reverse= reverse + MI8.charAt(i);
        }

        System.out.println(reverse);

        if (reverse == new String(MI8)) {

            System.out.println("Given string is Palendrome");

        } else {
                {
                    System.out.println("Given string is not palendrome");

                }
            }

        }
    }
