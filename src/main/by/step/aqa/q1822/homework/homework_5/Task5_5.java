package by.step.aqa.q1822.homework.homework_5;

/*Pr5-5
1. Create a class without a constructor, then  create an object of that class in main() to verify that the default constructor is automatically synthesized.
2. Create a class with a no-arg constructor (one  that takes no arguments) that prints a  message. Create an object of this class.
3. Add an overloaded constructor to Exercise 2 that  takes a String argument and prints it along with your message.
4. Create a class called Dog with an overloaded  bark() method. Your method should be overloaded based on various primitive data types,
 and should print different types of barking, howling, etc.,
5. Modify Exercise 4 so two of the overloaded  methods have two arguments of two different  types, but in reversed order relative to each  other.
6. Create a class with two methods. Within the first method call the second method twice to see it work, the first time without using this,
 and the second time using this.
7. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.*/


public class Task5_5 {

    public static void main(String[] args) {
        Dog d = new Dog(); //1
        Cat c = new Cat(); //2
        Cat c1 = new Cat("Cat says mew-mew"); //3
        Horse h1 = new Horse(); //4
        h1.horse();
        h1.say();

        h1.horse(2);
        h1.say();

        h1.horse(1.5, 4);//5
        h1.say();

        h1.horse(4, 1.5);
        h1.say();

        Part_6 part_6 = new Part_6(); //6

        part_6.second();

        Part_7 part_7 = new Part_7("HO_HO_HO");//7
    }
}

class Dog {

}

class Cat {

    public Cat() {
        System.out.println("Mew");
    }

    public Cat(String s) {
        System.out.println(s);
    }
}

class Horse {

    String voice;

    void horse() {
        voice = "Gav";
    }

    void horse(int a) {
        voice = "RRRR";
    }

    void horse(double x) {
        voice = "Gav-Gav";
    }

    void horse(double x, int y) {
        voice = "r-r-r-r-r-r";
    }

    void horse(int x, double y) {
        voice = "gav-gav-gav";
    }

    void say() {
        System.out.println("Лошадка говорит " + voice);
    }
}

class Part_6 {
    int a;
    char e = 'R';

    void  second () {
        first();
        this.first();
    }

    void first(){
        System.out.println("Значение переменной a=" + a + " Значение переменной e=" + e);
    }
}

class Part_7 {
    public Part_7 () {
        System.out.println("Hello from first constructor");
    }

    public Part_7 (String s) {
        this();
        System.out.println("Hello from second constructor " + s);
    }
}