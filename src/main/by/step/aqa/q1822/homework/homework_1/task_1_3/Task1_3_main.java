package by.step.aqa.q1822.homework.homework_1.task_1_3;

/*Pr1-3

        1. Turn the DataOnly code fragments into a
        program that compiles and runs.
        Here is an example of a class with some fields:

class DataOnly {
    int i;
    double d;
    boolean b;
}

2. Modify the exercise so the values
        of the data in DataOnly are assigned to and
        printed in main().
*/

public class Task1_3_main {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 10;
        dataOnly.d = 3.45;
        dataOnly.b = true;

        System.out.println("i = " + dataOnly.i);
        System.out.println("d = " + dataOnly.d);
        System.out.println("b = " + dataOnly.b);
    }
}
