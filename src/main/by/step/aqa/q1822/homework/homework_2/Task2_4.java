package by.step.aqa.q1822.homework.homework_2;

/*
Pr2-4
Get a sequence of random numbers and calculate their
arithmetic mean value. Stop the process when the next
number generated randomly equals to 0.
 */

public class Task2_4 {

    private int count = 0;
    private int summOfNumbers = 0;

    private int getRandomNumber(int from, int till) {
        return (int) (from + Math.random() * till);
    }

    private double arithmeticMeanTwoValues(int summOfNumbers, int count) {
        return summOfNumbers / count;
    }

    public static void main(String[] args) {
        Task2_4 task2_4 = new Task2_4();
        int currentValue = 0;
        System.out.print("Generated number : ");
        do {
            currentValue = task2_4.getRandomNumber(0, 10);

            if (currentValue != 0) {
                System.out.print(" " + currentValue);
            }

            task2_4.count++;
            task2_4.summOfNumbers += currentValue;

        } while (currentValue != 0);

        task2_4.count--;
        System.out.println();
        System.out.println("Count " + task2_4.count);
        System.out.println("Summ of numbers " + task2_4.summOfNumbers);

        System.out.println("Arithmetic mean: " + task2_4.arithmeticMeanTwoValues(task2_4.summOfNumbers, task2_4.count));
    }
}
