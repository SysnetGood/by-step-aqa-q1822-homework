package by.step.aqa.q1822.homework.homework_5;

/*Pr5-1
Create wrapper class objects using different approaches (constructors, literals).
Create code that uses an xxxValue() method, a parseXxx()
method, and a valueOf() method.
*/

public class Task5_1 {

    Integer i = 8;
    Integer i1 = new Integer(10);
    Integer i2 = new Integer("25");

    Boolean b = true;
    Boolean b1 = new Boolean(false);
    Boolean b2 = new Boolean("true");

    Double d = 2.65;
    Double d1 = new Double(33.2);
    Double d2 = new Double("22.32");

    Character c = 'a';
    Character c1 = new Character('h');

    Short s = 88;
    Short s1 = new Short((short)35);
    Short s2 = new Short("78");

    Long l = 77777l;
    Long l1 = new Long(32312);
    Long l2 = new Long("5435345");

    Float f = 34.66f;
    Float f1 = new Float(66.55f);
    Float f2 = new Float("95.33f");

    Byte by = 6;
    Byte by1 = new Byte((byte)-60);
    Byte by2 = new Byte("127");

    public static void main(String[] args) {
        Task5_1 ob = new Task5_1();
        System.out.println("Integern i ="+ ob.i + " Integer i1 =" + ob.i1 + " Integer i2 =" + ob.i2);
        System.out.println("Boolean b ="+ ob.b + " Boolean b1 =" + ob.b1 + " Boolean b2 =" + ob.b2);
        System.out.println("Double d ="+ ob.d + " Double d1 =" + ob.d1 + " Double d2 =" + ob.d2);
        System.out.println("Character c ="+ ob.c + " Character c1 =" + ob.c1);
        System.out.println("Short s ="+ ob.s + " Short s1 =" + ob.s1 + " Short s2 =" + ob.s2);
        System.out.println("Long l ="+ ob.l + " Long l1 =" + ob.l1 + " Long i2 =" + ob.l2);
        System.out.println("Float f ="+ ob.f + " Float f1 =" + ob.f1 + " Float f2 =" + ob.f2);
        System.out.println("Byte by ="+ ob.by + " Byte by1 =" + ob.by1 + " Byte by2 =" + ob.by2);

        Integer a = Integer.valueOf(55);
        Double b = Double.valueOf(44.3);
        Float c = Float.valueOf("55.44");
        Integer d = Integer.valueOf("33",16);
        System.out.println("Метод valueOf");
        System.out.println("Integer.valueOf(55) =" + a + " Double.valueOf(44.3)" + b + " Float.valueOf"
                + "(\"55.44\")" + c + " Integer.valueOf(\"33\",16)" + d);

        Integer a1 = 16;
        System.out.println("Метод xXXValue Byte " + a1.byteValue());
        System.out.println("Метод xXXValue Double " + a1.doubleValue());

        int a2 = Integer.parseInt("56");
        double d1 = Double.parseDouble("28");
        int i3 = Integer.parseInt("54",8);
        System.out.println("Метод parseIntXxx():");
        System.out.println("ParseInt =" + a2 + " ParseDouble =" + d1 + " ParseInt (i3 восьмиричное 54) =" + i3);

    }
}
