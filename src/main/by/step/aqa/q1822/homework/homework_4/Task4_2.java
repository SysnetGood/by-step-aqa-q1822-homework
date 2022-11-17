package by.step.aqa.q1822.homework.homework_4;

/*Pr4-2
Find the maximum mark in a group of students. Print this mark itself and its index.
*/

public class Task4_2 {

    void num(int[] ocenkipul, String[] Students) {
        int max = 0;

        if (ocenkipul.length > Students.length || Students.length > ocenkipul.length) {
            System.out.println("Оценки и студенты не равны!!!");
            return;
        }

        for (int i = 0; i < ocenkipul.length; i++) {
            System.out.print(Students[i] + " ");
            System.out.println(ocenkipul[i] + " ");
        }
        System.out.println("Оценки группы:");

        for (int i = 0; i < ocenkipul.length; i++) {
            if (ocenkipul[i] >= max) {
                max = ocenkipul[i];
            }
        }

        for (int i = 0; i < ocenkipul.length; i++) {
            if (ocenkipul[i] == max) {
                System.out.println("Наибольший балл: " + max + " получил студент " +
                        Students[i] + " с индексом " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Task4_2 s = new Task4_2();
        int ocenkipul[] = {8, 4, 6, 10, 10};
        String Students[] = {"Ivanov", "Petrov", "Sidorov", "Kozlov", "Petrenko"};
        s.num(ocenkipul, Students);
    }
}
