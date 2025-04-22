package Pieces;

import Game.Player;
import Game.Type;

// class for the bishop piece.
public class Bishop extends Piece {

    public Type type;

    public Bishop(int x, int y, Player player){
        super(x,y,player);
        type = Type.BISHOP;
    }

    @Override     // to return the type of the piece
    public Type getType() {
        return type;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        int x_diff = Math.abs(finalX-x) ;
        int y_diff = Math.abs(finalY-y) ;

        return x_diff == y_diff;  // this returns true or false.
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
                // array must be 1 to print the path.
        int[][] path =new int[8][8];
        int x_diff = Math.abs(finalX-startX);
        for(int i=startX;i<finalX;i++){
            path[i][i] = 1;    // assign value 1 where it is necessary to draw the path.
        }

        return path;
    }
}
