package by.step.aqa.q1822.homework.homework_4;

/*Pr4-3
Create an array of random numbers. Print it and reverse the order of elements. Print it once again. Try to use a single array to solve the tas
*/

public class Task4_3 {

    void chan(){
        int indexArr = 0;

        int arr[] = new int[10];

        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100 + 1);
            System.out.print(arr[i] + "(" + i + ")" + " ");
        }

        System.out.println();
        System.out.println("Массив заполненный с изменением элементоов:");

        for(int i = 0;i<arr.length/2;i++){
            indexArr = arr[i];
            arr[i] = arr [arr.length - 1 - i];
            arr [arr.length - 1 -i] = indexArr;
        }

        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + "(" + i + ")" + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task4_3 ch = new Task4_3();
        ch.chan();
    }
}
