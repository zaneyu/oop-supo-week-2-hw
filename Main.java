import java.util.Scanner;
public class Main{
    private static final Scanner in = new Scanner(System.in);
    private static final Scoreboard scoreboard = new Scoreboard();
    public static void main(String args[]){
        boolean again=true;
        while(again){
            System.out.print("Enter player name: ");
            Player player=scoreboard.getPlayer(in.nextLine().trim());
            Difficulty difficulty=getDifficulty();
            HiLoGame game=new HiLoGame(difficulty);
            int result=play(game,difficulty);
            scoreboard.record(player,result);
            scoreboard.printResults();
            System.out.println("Rematch? (y/n)");
            again=in.nextLine().trim().toLowerCase().startsWith("y");
        }
    }
    private static Difficulty getDifficulty(){
        boolean chosen=false;
        Difficulty difficulty=new Difficulty(1,10,10);
        while(chosen==false){
            System.out.println("Choose your difficulty (Easy/Medium/Hard): ");
            String s=in.nextLine().trim();
            System.out.println(s);
            String[] choice={"Easy","Medium","Hard"};
            int[] max={10,100,1000};
            int[] guesses={9,8,10};
            for(int i=0;i<3;i++){
                if(choice[i].equals(s)){
                    difficulty=new Difficulty(1,max[i],guesses[i]);
                    chosen=true;
                }
            }
            if(chosen==false){
                System.out.println("Please choose a valid difficulty!");
            }
        }
        return difficulty;
    }
    private static int play(HiLoGame game,Difficulty difficulty){
        boolean done=false;
        while(!done){
            System.out.println("Guess a whole number between "+difficulty.getMin()+" and "+difficulty.getMax()+"!");
            int value;
            try {
                value=Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please type a whole number.");
                continue;
            }
            String result=game.guess(value);
            System.out.println(result);
            if(result=="Game over! Better luck next time!"){
                return -1;
            }
            if(result=="Correct!"){
               return game.getGuesses();
            }
        }
        return -1;
    }
}