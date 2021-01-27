import java.util.Scanner;

public class SuperJDBros {

    public static void main(String[] args) {
        choosePlayer();

    }

    public static void choosePlayer() {
        Scanner pickPlayer = new Scanner(System.in);
        // function has to run in void Main in order to print out
        System.out.println("Which player would you like to continue with?");
        String playerOption = pickPlayer.nextLine();
//        // Here, you'll pick a player with either A or B
//        // if statement lets player choose A or B
//        // output is supposed to let player play with player 1
//        // add super secret items if they play again
        String playerA = "";
        String playerB = "";
        if (playerOption.equals("A")) {
            playerA = "Jario";
            System.out.println("By pressing A,you have chosen " + playerA + "!");
        } else {
            if (playerOption.equals("B")) {
                playerB = "Darluigi";
                System.out.println("By pressing B, you have chosen " + playerB + "!");
            }
        }

//        public static void theFight() {
//
//        }
    }
}
