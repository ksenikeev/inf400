package ru.itis.inf400.cw1;

public class Main {
    public static void main(String[] args) {
        var2();
    }
    public static void var2() {
        int a = 3;
        int b = a++ * a--;
        System.out.println(a & 4 * b | 5);

        a = 10;
        System.out.println(((a-- > 10) & (a++ < 20)) || !(a == 11));
    }

    public static void var1() {
        int a = 3;
        int b = a-- * a--;
        System.out.println(a ^ 3 + b | 7);

        a = 17;
        System.out.println(!(((a++ > 16) | (a-- < 20)) && (a == 17)));
    }

    public static void var4() {
        int a = 4;
        int b = a-- / a++;

        System.out.println(2 * a << b | 5);

        a = 7;
        //System.out.println((!(a == a | 0x7) | (a++ < 8) || (--a == 8)));
    }

    public static void var5() {
        int a = 4;
        int b = --a * a--;

        System.out.println( a-- >> 1 + 2 ^ b * 3);

        a = 3;
        //System.out.println(((5 | a == ~a & 0xf) | !(a < 9)) || !(--a % 2 == 1));
    }

    public static void var9() {
        int a = 2;
        int b = a++ & a++;

        System.out.println( a ^ 3 + b ^ 5);

        a = 8;
        System.out.println(((a++== (byte) 8) & (a++ < 11) || !(--a == 10)));
    }

    public static void var10() {
        int a = 4;
        int b = a-- * a--;

        System.out.println( a & 7 + b | 4);

        a = 12;
        System.out.println((a-- > 11) & (a++ < 20) || !(--a == 12));
    }
}
