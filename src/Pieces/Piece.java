package Pieces;
import Game.Player;
import Game.Type;

//created a generic abstract piece class to all the board pieces.
public abstract class Piece {

    //color,coordinate,movement,player

    public int x;    // x coordinate of the piece
    public int y;    // y coordinate of the piece
    public Player player;

    public Piece(int x,int y,Player player){
        this.x = x;
        this.y =y;
        this.player = player;
    }

    public abstract boolean isValidPath(int finalX,int finalY);

    public abstract int[][] drawPath(int startX,int startY,int finalX,int finalY);

    public abstract Type getType();



}
