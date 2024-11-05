package day3barat;

public class Barat {
    public static void main(String[] args) {

//        int c = 30;
//        System.out.println(c+=6);
//        System.out.println(c-=10);
//        System.out.println(c*=6);
//        System.out.println(c/=10);
//        System.out.println(c%=6);
//
//        int a=10, b=20;
//        System.out.println("a equal to:" + (a+=10));
//        System.out.println("b equal to:" + (b-=10));
//

//        int a=30,b=50,c;
//
//        System.out.println("Value of a before swappig is:" + 30);
//        System.out.println("Value of b before swappig is:" + 50);
//
//         c=a;
//         a=b;
//         b=c;
//
//         System.out.println(a);
//        System.out.println(b);
//
//        System.out.println("Value of a after swappig is:" + 50);
//        System.out.println("Value of b after swappig is:" + 30);

        int a=50, b=40;

        System.out.println("Value of a before swappig is:" + 50);
       System.out.println("Value of b before swappig is:" + 40);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
       System.out.println(b);

       System.out.println("Value of a after swappig is:" + 40);
        System.out.println("Value of b after swappig is:" + 50);

    }

}