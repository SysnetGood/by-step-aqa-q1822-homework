package by.step.aqa.q1822.homework.homework_1.task_1_4;

public class Task1_4_main {

    public static void main(String[] args) {
        Spaceship s1 = new Spaceship();
        s1.name = "Spaceship 1";
        s1.speed = 300;

        Spaceship s2 = new Spaceship();
        s2.name = "Spaceship 2";
        s2.speed = 500;


        System.out.println("Spaceship name: " + s1.name + " spaceship speed " + s1.speed);
        System.out.println("Spaceship name: " + s2.name + " spaceship speed " + s2.speed);

        s1.showSpaceshipName();
        s1.showSpaceshipSpeed();

        s2.showSpaceshipName();
        s2.showSpaceshipSpeed();
    }
}
