package by.step.aqa.q1822.homework.homework_3;

/*Pr3-5*
Create a game. You have a field 10x10 cells. Your initial position is
left down corner. You should follow the hero to the top right corner
through the field of obstacles. Use ‘w’, ’e’, ’n’, ’s’ (or
alternatively '4', '6', '8', '2') symbols read from console.
Use all possible forms of unary increment and decrement operations to
move the hero in the given directions. Each time assign the result of
the operation to your variable.
Use a switch statement a the program.
Show the current position of the hero on the field in console as “X”
symbol.

Read data from keybourd method (four directions '4', '6', '8', '2'):

     private int getDirection(){
         int direction = 0;

         try {
             BufferedReader br = new BufferedReader(
                 new InputStreamReader(System.in));
             direction = Integer.parseInt(br.readLine());
         } catch (IOException ex) {
             System.out.println("Ошибка ввода!!!");
         }

         return direction;
     }
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_5 {
    public static void main(String[] args) {
        Go ob = new Go();
        ob.start();
    }

}


class Map {

    private char Empty;

    public char GetEmpty() {
        return Empty;
    }

    public void SetEmpty(char Empty) {
        this.Empty = Empty;
    }

    protected char[][] map() {
        char[][] map = new char[10][10];
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = Empty;
            }
        return map;
    }
}

class MapAndBarrier {

    private char Barrier;
    private int z;

    public char GetBarrier() {
        return Barrier;
    }

    public void SetBarrier(char Barrier) {
        this.Barrier = Barrier;
    }

    public void SetLvl(int x) {
        if (x > 100) {
            System.out.println("Не может быть больше 100 процентов");
            System.exit(0);
        } else if (x < 0) {
            System.out.println("Не может быть меньше 0");
            System.exit(0);
        } else
            x = x;
        this.z = x;
    }

    protected char[][] MapAndBar(char[][] map) {
        int x, y;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < z / map[i].length; j++) {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
                map[x][y] = Barrier;
            }
        }
        map[0][9] = '_';
        return map;
    }
}

class Hero {

    private char Person;
    private int a = 9, b = 0;

    public int geta() {
        return a;
    }

    public int getb() {
        return b;
    }

    public char GetPerson() {
        return Person;
    }

    public void SetPerson(char Person) {
        this.Person = Person;
    }

    protected char[][] hero(char[][] map) {
        map[a][b] = Person;
        System.out.println("Show must go on");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        return map;
    }
}

class Game {

    private int getDirection() {
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Ошибка ввода!!!");
        } catch (NumberFormatException ex) {
            System.out.println("Введите число!!!");
        }
        return direction;
    }

    private void ShowGame(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void say() {
        System.out.println("You shall not pass!!!");
    }

    protected void games(char[][] map, int x, int y, char Person, char Barrier, char Empty) {
        int direct = getDirection();
        while (direct != 2 && direct != 4 && direct != 6 && direct != 8) {
            System.out.println("Неверно задано направление движения!!!");
            direct = getDirection();
        }
        switch (direct) {
            case 2:
                if ((x < 9) && (map[x + 1][y] != Barrier)) {
                    map[++x][y] = Person;
                    map[x - 1][y] = Empty;
                    ShowGame(map);
                } else
                    say();
                break;
            case 4:
                if ((y > 0) && (map[x][y - 1] != Barrier)) {
                    map[x][--y] = Person;
                    map[x][y + 1] = Empty;
                    ShowGame(map);
                } else
                    say();
                break;
            case 6:
                if ((y < 9) && (map[x][y + 1] != Barrier)) {
                    map[x][++y] = Person;
                    map[x][y - 1] = Empty;
                    ShowGame(map);
                } else
                    say();
                break;
            case 8:
                if ((x > 0) && (map[x - 1][y] != Barrier)) {
                    map[--x][y] = Person;
                    map[x + 1][y] = Empty;
                    ShowGame(map);
                } else
                    say();
                break;
        }
        if (map[0][9] == Person)
            System.out.println("Show is over");
        else {
            games(map, x, y, Person, Barrier, Empty);
        }
    }
}

class Go {

    protected void start() {
        Map m = new Map();
        Hero h = new Hero();
        Game g = new Game();
        MapAndBarrier mnew = new MapAndBarrier();
        h.SetPerson('H');
        m.SetEmpty('_');
        mnew.SetBarrier('B');
        mnew.SetLvl(30);
        g.games(h.hero(mnew.MapAndBar(m.map())), h.geta(), h.getb(),
                h.GetPerson(), mnew.GetBarrier(), m.GetEmpty());
    }
}