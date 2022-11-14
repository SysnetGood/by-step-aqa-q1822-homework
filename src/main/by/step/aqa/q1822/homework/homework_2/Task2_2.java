package by.step.aqa.q1822.homework.homework_2;

public class Task2_2 {

    public static void main(String[] args) {
        Task2_2 task2_2 = new Task2_2();

        for (int i = 0; i < 10; i++) {
            task2_2.coinflip();
        }
    }

    private int getRandomNumber(int from, int till) {
        return (int) ( from + Math.random() * till);
    }

    public void coinflip() {
        if (getRandomNumber(1, 100) <= 50) {
            System.out.println("Tails");
        } else {
            System.out.println("Heads");
        }
    }

}
