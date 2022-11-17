package by.step.aqa.q1822.homework.homework_1;

/*Pr1-2
        Create a class containing an int and a char
        that are not initialized. Print their values
        to verify that Java performs default
        initialization.
*/

public class Task1_2 {

    private int a;
    private char b;

    public static void main(String[] args) {
        Task1_2 task1_2 = new Task1_2();
        System.out.println("int a = " + task1_2.a);
        System.out.println("char b = " + task1_2.b);
    }

}
