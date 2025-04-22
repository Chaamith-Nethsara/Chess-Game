package Pieces;

import Game.Player;
import Game.Type;

public class Rook extends Piece{

    public Type type;

    public Rook(int x, int y, Player player){
        super(x,y,player);
        type = Type.ROOK;
    }

    public Type getType(){
        return type;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        int x_diff = x-finalX;
        int y_diff = y-finalY;
        boolean valid;
        if(x_diff==0 && (y_diff>0 || y_diff <0)){
            valid = true;
        } else if (y_diff==0 && (x_diff>0 || x_diff<0)) {
            valid = true;

        }else{
            valid = false;
        }
        return valid;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        int x_diff = startX - finalX;
        int y_diff = startY - finalY;
        int [][] path = new int[8][8];
        if(x_diff==0){

        }else{

        }
        return path;
    }
}
