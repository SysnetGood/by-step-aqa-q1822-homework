package by.step.aqa.q1822.homework.homework_4;

/*Pr4-1
Sort an array of random generated numbers.
*/

public class Task4_1 {

    void sortarray(int arr[]) {
        System.out.print("Исходный массив: ");
        showArray(arr);
        for (int a = 1; a < arr.length; a++)
            for (int b = arr.length - 1; b >= a; b--)
                if (arr[b - 1] > arr[b]) {
                    int t = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = t;
                }
        System.out.print("Отсортированный массив: ");
        showArray(arr);
    }

    void showArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    int getRandomNumber (int from, int till) {
        return (int) (from + Math.random() * till);
    }

    public static void main(String[] args) {
        Task4_1 task4_1 = new Task4_1();
        int[] ar = new int[4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = task4_1.getRandomNumber(0,100);
        }
        task4_1.sortarray(ar);
    }
}
