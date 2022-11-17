package by.step.aqa.q1822.homework.homework_3;

/*
Pr3-4
Write a program to detect and print prime numbers
(integers evenly divisible only by themselves
and 1), using two nested for loops and the
modulus operator (%).
 */

public class Task3_4 {

    void pr (){
        int num, arg;

        for(num = 2; num <= 100; num++) {

            for(arg = 2; (num % arg) > 0; arg++) {

            }

            if(arg == num)
                System.out.print(num + " ");

        }
    }

    public static void main(String[] args) {
        Task3_4 p = new Task3_4();
        p.pr();

    }

}
