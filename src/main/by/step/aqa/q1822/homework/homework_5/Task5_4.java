package by.step.aqa.q1822.homework.homework_5;

/* Pr5-4
1) Create code that instantiates instances of two different numeric
wrapper classes, adds the values of the two instances together, and then
creates a third numeric wrapper instance whose value is the sum.
2) Demonstrate that numeric wrapper classes are immutable.
3) Show a situation when new objects of wrapper classes are not created.*/


public class Task5_4 {

    Integer i1, i2, i3;
    Double d1, d2, d3;

    void sumint(){
        i1 = 10;
        i2 = 40;
        i3 = i1 + i2;
        System.out.println("Сумма двух классов оберток типа Integer = " + i3);
    }

    public static void main(String[] args) {
        Task5_4 w = new Task5_4();

        w.sumint();

        w.d1 = 70.4;
        w.d2 = w.d1;
        w.d3 = w.d1;
        w.d3++;
        System.out.println("Ссылки в классе оберток: d1= " + w.d1 + " d2= " + w.d2 + " d3 ссылае"
                + "тся на d1 d3++ = " + w.d3);

        w.i1 = 200;
        w.i2 = 200;
        w.i3 = w.i1;
        System.out.println(w.i1 == w.i3);
        System.out.println("Сравнение двух переменных i1 = i2 значение перем"
                + "енных 200 так как i1 and i2 > -127 and 128 (ссылки на объект разные) " + (w.i1 == w.i2));
        w.i1 = 30;
        w.i2 = 30;
        w.i3 = w.i1;
        System.out.println(w.i1.equals(w.i3));
        System.out.println("Сравнение двух переменных i1 = i2 значе"
                + "ние переменных 30 так как i1 and i2  < -127 and 128 (работа с пулом) для \nпо"
                + "нимания использую метод equals т.к. хеш-код одинаковый " + w.i1.equals(w.i2));

    }
}
