import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int answer=random.nextInt(1,101);
        int guess;
        int attempt=0;
        boolean isRunning=true;
        System.out.println("*************");
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("*************");
        while(isRunning){
            
            System.out.println("Guess the numebr between 1 to 100: ");
            guess=scanner.nextInt();
            attempt++;
            if(guess>answer){
                System.out.println("TOO HIGH!!");
            }
            else if(guess<answer){
                System.out.println("TOO LOW!!!");
            }
            else{
                System.out.println("Your guess is correct the correct answer is "+answer+" you took "+attempt+" attempt to guess the correct answer");
                isRunning=false;
            }
        }
        System.out.println("Thankd you for playing the game!! Have a nice day");
        scanner.close();
    }
}