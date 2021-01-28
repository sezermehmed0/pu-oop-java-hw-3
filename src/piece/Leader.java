package piece;

import java.awt.*;

public class Leader {

    private int row;
    private int col;
    private String color;

    public Leader(int row,int col){

        this.row = row;
        this.col = col;
    }
    /** This method is rendering "frog leaders" into the gameboard **/
    public void render(Graphics g){
        if(this.row % 2 == col % 2) {
            //Yellow frog leader
            g.setColor(Color.yellow);
            g.fillRect(470,51,40,40);
            // Green frog leader
            g.setColor(Color.green);
            g.fillRect(35,482,40,40);

        }
    }
}
