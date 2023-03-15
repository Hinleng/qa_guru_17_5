package guru.qa;

public class Main {
    public static void main(String... args) {
        boolean varBoolean = false;
        byte varByte = 127; // -128 ... 127
        short varShort = 1000; // -321768  ... 321767
        int varInt = 1000000; // -2147483648 ... 2147483647
        long varLong = -100000000L; // -9223372036854775808 ... 9223372036854775807
        float varFloat = 0.26F; //1.4e-45f ... 3.4e+38f
        double varDouble = 0.26d; // 4.9e-324 ... 1.7e+308
        byte byteSum = (byte) (varByte*2);
        int intSum = varInt*varInt;
        System.out.println("Переполнение byte:" + byteSum);
        System.out.println("Переполнение int: " + intSum);

        System.out.println("Сложение: " + (varByte+varShort));
        System.out.println("Вычитание: " + (varInt-varShort));
        System.out.println("Деление: " + varLong/varInt);
        System.out.println("Умножение: " + varByte*varShort);

        System.out.println("Сложение int и double: " + (varInt+varDouble));
        System.out.println("Вычитание int и double: " + (varInt-varDouble));
        System.out.println("Умножение int и double: " + (varInt*varDouble));
        System.out.println("Деление int и double: " + (varInt/varDouble));
    }
}
