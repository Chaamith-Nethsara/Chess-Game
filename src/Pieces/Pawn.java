package Pieces;

import Game.Player;
import Game.Type;

public class Pawn extends  Piece{

    public Type type;

    public Pawn(int x, int y, Player player){
        super(x,y,player);
        type = Type.PAWN;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        return new int[0][];
    }
}
