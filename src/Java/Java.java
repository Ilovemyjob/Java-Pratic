package Java;

import java.util.Arrays;

public class Java {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CharSequence[]{"MerhabaTelevole"}));


        int a =1;
        int b =2;
        System.out.println(a+b);
        int c= a+b;
        System.out.println(c);

        System.out.println("----------");//we called Method here
        System.out.println(add(a));
        System.out.println(add(2));
        System.out.println(add2(a,b));
        System.out.println(add2(2,3));

//        System.out.println("------------");// We call Method and Attribute in other Class
//       Call Auto = new Call();
//        Auto.kmOld=100;
//        Auto.kmNew=150;
//        Auto.litre=50;
//        System.out.println(Auto.Benzin());

        System.out.println("------------");// We call Method and Attribute in other Class
        Call Auto = new Call( 100,  150,  50);
        System.out.println(Auto.Benzin());

//        System.out.println("-------------"); // We called static Method from other class
//        System.out.println(Call.km());


    }

    private static int add2(int a, int b) {
        return a+b;
    }

    private static int add(int a) {
        return 1;
    }
}
