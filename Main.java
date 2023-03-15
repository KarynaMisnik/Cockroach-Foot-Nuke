import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player;
        int computer = 0;

        
        while(true) {
        	System.out.println("Cockroach wins Nuke but loses to Foot. Foot wins Cockroach but loses to Nuke. Nuke loses Cockroach but wins to Foot.");
        	 System.out.println("1.Cockroach;\n2.Foot;\n3.Nuke;\n4.Exit;");
        	  System.out.print("Make a move: ");
              player = scanner.nextInt();
              Random random = new Random();
              int randomNum = random.nextInt(3)+1;
              
              if(player > 3) {
            	  break;
              }

              if (randomNum == 1) {
                  computer = 1;
              } else if (randomNum == 2) {
                  computer = 2;
              } else{
                  computer = 3;
              }
              System.out.println("Computer chose " + computer + "!");
        

        // Print results
        if (player == computer) {
            System.out.println("It's a tie!");
        } else if (playerWins(player, computer)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }
    }
    
    static boolean playerWins(int player, int computer) {
        if (player == 1) {
            return computer == 3;
        } else if (player == 2) {
            return computer == 1;
        } else {
            return computer == 2;
        }
    }
}

