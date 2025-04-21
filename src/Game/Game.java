package Game;
import java.util.Date;

public class Game {
    public Date match_time;
    public String game_difficulty;
    public Date started_time;
    public Date finished_time;

    // game time(15min,30min),game difficulty,game start time,game finish time,start game,end game,restart game.

    public Game(Date match_time,String game_difficulty){
        this.match_time = match_time;
        this.game_difficulty = game_difficulty;
    }


    public void startGame(){
        System.out.println("Game Started");
    }
    public void stopGame(){
        System.out.println("Game stopped");
    }
    public void restartGame(){
        System.out.println("Game restarted");
    }
}
