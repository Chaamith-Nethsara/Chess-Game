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
        int x_diff = x-finalX;
        int y_diff = y-finalY;

        if(x_diff==y_diff){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        return new int[0][];
    }
}
