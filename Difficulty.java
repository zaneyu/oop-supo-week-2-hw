public class Difficulty{
    private final int min;
    private final int max;
    private final int maxGuesses;
    Difficulty(int min,int max,int maxGuesses){
        this.min=min;
        this.max=max;
        this.maxGuesses=maxGuesses;
    }
    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }
    public int getMaxGuesses(){
        return maxGuesses;
    }
}
