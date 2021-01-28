package piece;



import game.GameTile;

import java.awt.*;
import java.util.Random;

public class Turtle {

    private int row;
    private int col;

    public Turtle(int row, int col, Graphics g) {
        this.row = row;
        this.col = col;


    }

    /** Метод за рисуване на костенурките върху дъската
     *
     * @param g
     */
    public void renderTurtle(Graphics g) {
            Random randomPos = new Random();
            int number  = 5;
            int randomPosition = randomPos.nextInt(number);


            g.setColor(Color.RED);

            if (randomPosition == 3) {
                g.fillOval(30, 255, 50, 50);

            }
            if (randomPosition == 0) {
                g.fillOval(140, 255, 50, 50);


            }
            if (randomPosition == 4) {
                g.fillOval( 350, 255,50,50);



                } else
                    g.fillOval(450, 125, 50, 50);

            }
        }





