package by.step.aqa.q1822.homework.homework_4;

/*Pr4-4
Create a two dimensional array and fill it to produce a butterfly:

1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
*/

public class Task4_4 {

    void but (){

        int butterfly[][]=new int[5][5];

        int i,j;

        for (i=0; i < butterfly.length/2; i++){
            for (j=0; j < butterfly[i].length; j++){
                if ((j < i) || (j >= (butterfly[i].length-i)))
                    butterfly[i][j]=0;
                else butterfly[i][j]=1;
            }
        }

        for (i=butterfly.length-1; i >= butterfly.length/2; i--){
            for (j = 0; j < butterfly[i].length; j++){
                if ((j < (butterfly[i].length-1-i)) || (j > i))
                    butterfly[i][j]=0;
                else butterfly[i][j]=1;
            }
        }

        for (i=0; i < butterfly.length;i++){
            for(j=0; j < butterfly[i].length; j++){
                System.out.print(butterfly[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task4_4 bt = new Task4_4();
        bt.but();
    }

}
