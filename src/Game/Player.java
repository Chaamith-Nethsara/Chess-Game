package Game;

import java.util.Date;

public class Player {
    public String player_name;
    public String player_email;
    public int matches_won;
    public Date time;

    public Player(String name,String email,int matches,Date time){
        player_name = name;
        player_email = email;
        matches_won = matches;
        this.time = time;

    }

    public String getPlayerDetails(){
        return player_name+" "+player_email;
    }

    public Date getPlayedTime(){
        return time;
    }
    public int getMatches_won(){
        return matches_won;
    }

}
