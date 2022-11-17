package by.step.aqa.q1822.homework.homework_3;

/*
        Pr3-1
        Get all special values for types float and double executing wrong
        operations.
        Try to compare values using this operations:
        -Infinity<-0,0=0.0< Infinity
*/

public class Task3_1 {

    public static void main(String[] args) {
        float fl1, fl2, fl3, fl4;
        System.out.println("float");
        fl1 = 3.4e+38f * 3.4e+38f;
        System.out.println("Умножение максимальных значений " + fl1);
        fl2 = 3.4e+38f / -1.4e-45f;
        System.out.println("Деление max значений на min " + fl2);
        fl3 = -1.4e-45f * -1.4e-45f;
        System.out.println("Умножение минимальных значений " + fl3);
        fl4 = -1.4e-45f / 3.4e+38f;
        System.out.println("Деление min значений на max " + fl4);
        if (fl2 < fl4 == fl3 < fl1) {
            System.out.println(fl2 + " < " + fl4 + " == " + fl3 + " < " + fl1);
            System.out.println(fl2 < fl4 == fl3 < fl1);
        } else {
            System.out.println("Выражение не верно!");
        }

        double d1, d2, d3, d4;
        System.out.println("float");
        d1 = 1.7e+308 * 1.7e+308;
        System.out.println("Умножение максимальных значений " + d1);
        d2 = 1.7e+308 / -4.9e-324;
        System.out.println("Деление маx значений на min " + d2);
        d3 = -4.9e-324 * -4.9e-324;
        System.out.println("Умножение минимальных значений " + d3);
        d4 = -4.9e-324 / 1.7e+308;
        System.out.println("Деление min значений на max " + d4);
        if (d2 < d4 == d3 < d1) {
            System.out.println(d2 + " < " + d4 + " == " + d3 + " < " + d1);
            System.out.println(d2 < d4 == d3 < d1);
        } else {
            System.out.println("Выражение не верно!");
        }

        System.out.println("Деление бесконечности на бесконечность: Infinity/Infinity = " + fl1 / d1);
        System.out.println("Умножение нуля на бесконечность: 0*Infinity = " + 0 * d1);
        System.out.println("Сложение бесконечности с бесконечностью "
                + "противоположного знака: Infinity + -Infinity = " + (fl1 + fl2));
        System.out.println("все математические операции, содержащие NaN "
                + "в качестве одного из операндов: Double (Float) + (-,*,/ и т.д.) "
                + "пр. double * NaN = " + (1.7e+308 * (fl1 / d1)));
        System.out.println("Вычисление квадратного корня отрицательного числа: "
                + "квадратный корень из -float = " + Math.sqrt(-1.4e-45f));
        System.out.println("Логарифмирование отрицательного числа: "
                + "log(-float) = " + Math.log(-1.4e-45f));
    }
}
