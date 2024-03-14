import java.util.*;
public class number_game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chn=8;
        int fin=0;
        boolean play_again=true;
        System.out.println("Welcome To The Game!");
        System.out.println("You have "+chn+" chances to win the game");
        while(play_again){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chn;i++){
                System.out.println("Chance "+(i+1)+"------ Enter your guess: ");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    fin+=1;
                    System.out.println("Congrats!! You won");
                    break;
                }
                else if(user>rand){
                    System.out.println("Guess Too High");
                }
                else{
                    System.out.println("Guess Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry Player. You lost the chances. The number is " +rand);
            }
            System.out.println("Do you wanna play again??(y/n)");
            String pa=sc.next();
            play_again=pa.equalsIgnoreCase("y");
        }
        System.out.println("That's it, Hope you enjoyed the game.");
        System.out.println("Here is your score: "+fin);
    }
    public static int getrandN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}