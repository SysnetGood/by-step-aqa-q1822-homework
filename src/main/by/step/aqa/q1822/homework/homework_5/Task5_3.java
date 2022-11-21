package by.step.aqa.q1822.homework.homework_5;

/* Pr5-3
Create a 2D array and a 3D array.
Copy the 2D array into a part of the 3D array.
1) Reference redirection
2) Real copy of the initial 2D array as a branch of the 3D array*/

public class Task5_3 {

    private int c = 5;
    private int[][] a = new int[c][c];
    private int[][][] b = new int[c][c][c];

    void newar() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    void showa() {
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }

    void arrb() {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int f = 0; f < b[i][j].length; f++) {
                    b[i][j][f] = 0;
                }
            }
        }
    }

    void copyarr() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[0][i][j] = a[i][j];
            }
        }
    }

    void showb() {
        for (int i = 0; i < b.length; i++) {
            System.out.println();
            for (int j = 0; j < b[i].length; j++) {
                System.out.println();
                for (int f = 0; f < b[i][j].length; f++) {
                    System.out.print(b[i][j][f] + " ");
                }
            }
        }
        System.out.println();
    }

    void copyarr2() {
        b[3] = a;
    }


    public static void main(String[] args) {
        Task5_3 task5_3 = new Task5_3();
        task5_3.newar();
        task5_3.showa();
        task5_3.arrb();
        task5_3.showb();
        task5_3.copyarr();
        task5_3.showb();
        task5_3.copyarr2();
        task5_3.showb();
    }
}
