package game;

import java.awt.*;

public class GameTile {
   public static final int TILE_SIZE = 110;

    private int row;
    private int col;



    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;



    }

    /** This method is rendering game tile **/
    public void render(Graphics g) {
        int tileX = this.col * TILE_SIZE;
        int tileY = this.row * TILE_SIZE;


        if (this.row % 2 == this.col % 2) {
            g.setColor(Color.decode("#FF6347"));
        } else {
            g.setColor(Color.decode("#8A2BE2"));
        }

        g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);
        g.setColor(Color.blue);
        g.fillOval(255, 255, 40, 40);

    }
}




