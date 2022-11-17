package by.step.aqa.q1822.homework.homework_3;

/*
Pr3-3
1. Generate the output 4247 from the original StringBuilder
“0123456789” using al the methods from the list below:
- append;
- insert;
-delete;
-replace.
2. Repeat the same task for String data type. Find out which methods are
not valid any more.
Use: string of methods call.
 */
public class Task3_3 {


    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("123456789");

        st =st.append("47").insert(5, "4").delete(0, 5).replace(1, 6, "2");
        System.out.println("Теперь текст \"0123456789\" - " + st);

        String st2 = "0123456789";

        st2 = (String) st2.concat("47").replace("9","2").replaceAll("012345678","44").subSequence(1, 5);
        System.out.println("Теперь текст \"0123456789\" - " + st2);
    }

}
