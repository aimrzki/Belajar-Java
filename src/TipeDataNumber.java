public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        System.out.println(iniByte);
        short iniShort = 1000;
        System.out.println(iniShort);
        int iniInt = 100000;
        System.out.println(iniInt);
        long iniLong = 100000000;
        System.out.println(iniLong);

        float iniFloat = 11.11F;
        System.out.println(iniFloat);
        double iniDouble = 11.1111;
        System.out.println(iniDouble);

        int decimalInt = 34;
        System.out.println(decimalInt);

        int hexaDecimal = 0xFFFFFF;
        System.out.println(hexaDecimal);

        // Angka boleh memakai underscore _
        int a = 60_000;
        int b = 5_000;
        int c = a+b;
        System.out.println(c);

        int iniInteger = 10;
        float iniFloat2 = iniInteger;
        System.out.println(iniFloat2);
    }
}
