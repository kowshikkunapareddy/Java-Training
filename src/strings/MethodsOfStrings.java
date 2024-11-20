package strings;

public class MethodsOfStrings {

    public static void main(String []args)
    {
      String a = "154,65,999$abc@gmail.com";
      String b = "abc@gmail.com";
      String c = "mnn@gmail.com";
      String numberFromOrginala = a.substring(2,12);


        System.out.println(a.charAt(10));
//        System.out.println(a.substring(2,12));
//        System.out.println(a.substring(12,26));
//
////        System.out.println(b.equals(c));
//        System.out.println(c.equals(a.substring(12,26)));
//        System.out.println(a.substring(2,12).equals(626772));
        System.out.println(numberFromOrginala.replace(",",""));
        System.out.println(a.substring(2,12).contains("65"));


    }

    }
