package by.step.aqa.q1822.homework.homework_2;

/*
Pr2-3
        Write a program that calculates velocity
        using a constant distance and a constant time.
 */

public class Task2_3 {
    private final double distance = 20.5;
    private final double time = 5;

    public static void main(String[] args) {
        Task2_3 task2_3 = new Task2_3();
        System.out.println("Velocity = " + (task2_3.distance / task2_3.time));
    }
}
