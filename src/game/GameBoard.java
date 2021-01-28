package game;

import piece.Guards;
import piece.Leader;
import piece.Turtle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class GameBoard extends JFrame implements MouseListener {
    private static final int SIZE_OF_THE_TILE = 110;
    private Object chosenPiece;


    /**
     * Constructor
     */
    public  GameBoard(){

        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.addMouseListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0 ; row < 5 ; row++){
            for (int col = 0 ;  col < 5 ; col++){

                GameTile tile = new GameTile(row,col);
                tile.render(g);

                //Yellow frog guards
                Guards g1 = new Guards(row,col);
                Guards g2 = new Guards(row,col);
                Guards g3 = new Guards(row,col);
                Guards g4 = new Guards(row,col);

                g1.render(g);
                g2.render(g);
                g3.render(g);
                g4.render(g);

                // Green frog guards
                Guards g5 = new Guards(row,col);
                Guards g6 = new Guards(row,col);
                Guards g7 = new Guards(row,col);
                Guards g8 = new Guards(row,col);

                g5.render(g);
                g6.render(g);
                g7.render(g);
                g8.render(g);

                //Yellow frog leader
                Leader l1 = new Leader(row,col);
                l1.render(g);

                //Green frog leader
                Leader l2 = new Leader(row,col);

                l2.render(g);
                Turtle renderTurtle = new Turtle(row,col,g);
                renderTurtle.renderTurtle(g);
                renderTurtle.renderTurtle(g);









            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        int rowCoordinates = this.getGameBoardCoordinates(e.getY());
        int colCoordinates = this.getGameBoardCoordinates(e.getX());

        if(this.chosenPiece !=null){
            Guards guards = (Guards) this.chosenPiece;
            guards.move(rowCoordinates,colCoordinates);

        }

    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

    private int getGameBoardCoordinates(int coordinates){
        return coordinates / SIZE_OF_THE_TILE;
    }

}
