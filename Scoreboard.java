import java.util.ArrayList;
public class Scoreboard{
    private final ArrayList<Player> players=new ArrayList<Player>();
    public Player getPlayer(String name){
        for(Player p:players){
            if(p.getName().equals(name)){
                return p;
            }
        }
        Player p=new Player(name);
        players.add(p);
        return p;
    }
    public void record(Player player,int result){
        player.record(result);
    }
    public void printResults(){
        System.out.println("Name | Average Guesses | Best Guess");
        for(Player p:players){
            System.out.println(p.getName()+" "+p.getAverageGuessesInWins()+" "+p.getBestGuesses());
        }
    }
}
