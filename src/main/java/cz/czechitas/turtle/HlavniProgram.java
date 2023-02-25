package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setLocation(100,500);

        nakresliKruh(1, Color.yellow);

        zofka.setLocation(400,500);

        nakresliRovnostrannyTrojuhelnik(100, Color.blue);

        zofka.setLocation(700,500);

        nakresliObdelnik(100, 150, Color.green);

        zofka.setLocation(1000,500);

        nakresliCtverec(100, Color.red);


    }

    private void nakresliCtverec(double delkaStrany, Color barvaCary) {
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    private void nakresliObdelnik(double delkaStranyA,double delkaStranyB, Color barvaCary) {
        if (delkaStranyA != delkaStranyB)
            for (int i = 0; i < 2; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
            }
    }

    private void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Color barvaCary) {
        for (int i = 0; i < 3; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStrany);
            zofka.turnRight(120);
        }
    }

    private void nakresliKruh(double delkaStrany, Color barvaCary) {
        for (int i = 0;i < 360; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStrany);
            zofka.turnRight(1);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
