public class Main {
    public static void main(String[] args) {
        // 1

//        int x = 7;
//        int y = 15;

        // დამატებითი ცვლადით

//        int c = a;
//        a = b;
//        b = c;
//
//        System.out.println(a);
//        System.out.println(b);

        // დამატებითი ცვლადის გარეშე

//        x = x + y;
//        y = x - y;
//        x = x - y;
//
//        System.out.println(x);
//        System.out.println(y);


        // 2

//        double x = 10.234;
//        int y = (int) x;
//
//        System.out.println(x-y);


        // 3

//        int x = 6282;
//
//        if (x >= 100 && x <= 999) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }


        // 4

//        char x = 'r';
//
//        char y = (char)(x-32);
//
//        System.out.println(y);


        // 5

//        double x = 14.4;
//
//        int y = (int)(x+0.5);
//
//        System.out.println(y);


        // 6

//        int a = 6;
//        int b = 4;
//        int k = 2;
//
//        System.out.println((a*b)/(k*k));


        // 7

//        int sec = 2655;
//        int min = 0;
//        int hr = 0;

//        if (sec >= 3600) {
//            hr = sec / 3600;
//            sec = sec % 3600;
//        }
//
//        if (sec >=60) {
//            min = sec / 60;
//            sec = sec % 60;
//        }
//
//        System.out.println(hr + ":" + min + ":" + sec);


        // 8

        int sec = 2655;

        int hr = sec / 3600;
        int min = (sec % 3600) / 60;
        int s = sec % 60;

        System.out.println(hr + ":" + min + ":" + s);
    }
}
