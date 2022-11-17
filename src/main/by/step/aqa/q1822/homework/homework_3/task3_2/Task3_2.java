package by.step.aqa.q1822.homework.homework_3.task3_2;

/*
Pr3-2
Write a program with two constant values, one with alternating binary
ones and zeroes, with a zero in the least-significant digit, and the
second, also alternating, with a one in the least-significant digit.
Combine these two values every way possible using the bitwise operators.
Display the results using
Integer.toBinaryString().
Hint: It's easiest to use hexadecimal constants for this.
Note: that Integer.toBinaryString( ) does not print leading zeroes.
 */

public class Task3_2 {


    public static void main(String[] args) {
        Bin b = new Bin();
        b.a = 0x230;
        b.b = 0x231;
        System.out.println("a = " + Integer.toBinaryString(b.a));
        System.out.println("b = " + Integer.toBinaryString(b.b));
        System.out.println("a + b = " + Integer.toBinaryString(b.a | b.b));
        System.out.println("a * b = " + Integer.toBinaryString(b.a & b.b));
        System.out.println("a ^ b = " + Integer.toBinaryString(b.a ^ b.b));
        System.out.println("~a = " + Integer.toBinaryString(~b.a));
        System.out.println("Операции сдвига");
        System.out.println("Сдвиг в право " + Integer.toBinaryString(b.a >> 1));
        System.out.println("Сдвиг в лево " + Integer.toBinaryString(b.a << 1));
        System.out.println("Беззнаковый сдвиг в право " + Integer.toBinaryString(-b.a >>> 1));
    }
}


