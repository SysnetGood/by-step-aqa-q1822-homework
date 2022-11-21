package by.step.aqa.q1822.homework.homework_5;

/*Pr5-2
1) Create a class
2) In the class define two fields: a – instance; b – static
3) In the class define two methods: a – instance; b – static
4) Access the fields from inside the main() method. Draw a conclusion.
Note: main() is static by default.
5) Call the methods from the main().
6) Draw a conclusion.*/

public class Task5_2 {

    static int a = 7;
    byte b;

    static int summ(int x, int y) {
        return x + y;
    }

    int multiplication(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        a = 15;
        // System.out.println(b); we can't call non-static value from static method
        summ(4, 5);
        //multiplication(3,3); we can't call non-static method from static method
    }
}
