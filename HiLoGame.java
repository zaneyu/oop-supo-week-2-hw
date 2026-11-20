import java.util.Random;
public class HiLoGame{
    private final Difficulty difficulty;
    private int secret;
    private int guesses=0;
    public HiLoGame(Difficulty difficulty){
        this.difficulty=difficulty;
        this.secret=difficulty.getMin()+(new Random()).nextInt(difficulty.getMax()-difficulty.getMin()+1);
    }
    public String guess(int value){
        guesses+=1;
        if(secret==value){
            return "Correct!";
        }
        if(guesses==difficulty.getMaxGuesses()){
            return "Game over! Better luck next time!";
        }
        if(secret<value){
            return "Go Lower!";
        }
        return "Go Higher!";
    }
    public int getGuesses(){
        return guesses;
    }
}
