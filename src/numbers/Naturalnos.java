package numbers;

public class Naturalnos {

    public static void main(String[] args) {
        System.out.println("in main");
        P4();
        P32();
        P64();
    }
    static int n;

    static void P1() {
        System.out.println(++n);
    }

    static void P2() {
        P1();
        P1();
    }

    static void P4() {
        P2();
        P2();
    }

    static void P8() {
        P4();
        P4();
    }

    static void P16() {
        P8();
        P8();
    }

    static void P32() {
        P16();
        P16();
    }

    static void P64() {
        P32();
        P32();
    }

    static void P128() {
        P64();
        P64();
    }

    static void P256() {
        P128();
        P128();
    }

    static void P512() {
        P256();
        P256();
    }
}
