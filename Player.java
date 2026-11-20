public class Player{
    private final String name;
    private int gamesPlayed=0;
    private int wins=0;
    private int totalGuessesInWins=0;
    private int bestGuesses=Integer.MAX_VALUE;
    public Player(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getGamesPlayed(){
        return gamesPlayed;
    }
    public int getWins(){
        return wins;
    }
    public int getBestGuesses(){
        return bestGuesses;
    }
    public void record(int result){
        gamesPlayed++;
        if(result!=-1){
            wins++;
            totalGuessesInWins+=result;
            bestGuesses=Math.min(bestGuesses,result);
        }
    }
    public double getAverageGuessesInWins(){
        return wins==0?0:(double)totalGuessesInWins/wins;
    }
}
