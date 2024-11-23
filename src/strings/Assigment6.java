package strings;

public class Assigment6 {

    public static void main(String[] args) {

        String Name = "Barat";
        String Char = "is good";
        String Chars = new String("is bad");



        StringBuilder combined = new StringBuilder();

        combined.append(Name).append("  ").append(Char);

        System.out.println(combined);
        System.out.println(Name.concat("  ").concat(Chars));

}
}
