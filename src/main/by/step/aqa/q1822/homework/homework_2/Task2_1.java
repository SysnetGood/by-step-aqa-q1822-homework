package by.step.aqa.q1822.homework.homework_2;

/*Pr2-1
        Write a program that includes and calls the
        storage() method

    int storage(String s) {
        return s.length() * 2;
    }
 */

public class Task2_1 {
    public static void main(String[] args) {
        Task2_1 task2_1 = new Task2_1();
        System.out.println("Length \"Hello World!\" string x 2 = " + task2_1.storage("Hello world!"));

    }

    public int storage(String s) {
        return s.length() * 2;
    }
}
