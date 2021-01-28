import java.util.Random;
import java.util.Scanner;

public class SuperJDBros {

    public static void main(String[] args) {
        choosePlayer();
        levelOne(0, 10);
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
    }
    public static void levelOne(int min, int max) {
        Random randLvl = new Random();
        int upperbound = 10;


        String lvlTwo = "level 2";
        int int_random = randLvl.nextInt(upperbound);
        for (int i = 0; i <= max; i++) {

        }


        System.out.println("The goomba's strength, that was defeated, level " + int_random + "," + " need to defeat more enemies");

        System.out.println("The turtle's strength, that was defeated, was level " + int_random +"," + " you have defeated enough enemies to move to " + lvlTwo);
    }
//    public static long getPowerRecursive(int base, int exponent) { // 1. getPowerRecursive(6, 3)  -- goal: 6 * 6 * 6
//        if (exponent == 0) {
//            return 1; // any number to the power of 0 is equal to 1
//        } else if (exponent == 1) {
//            return base; // any number to the power of 1 is equal to itself
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPowerRecursive(base, exponent - 1);  // we want to do 3 ^ 5, i.e. getPowerRecursive(3, 5)
//
//        // 1. return 3 * getPowerRecursive(3, (5-1)), i.e. getPowerRecursive(3, 4)
//        // 2. return 3 * ( 3 * getPowerRecursive(3, (4-1)) ), i.e. getPowerRecursive(3, 3)
//        // 3. return 3 * ( 3 * ( 3 * ( getPowerRecursive(3, (3-1)) ) , i.e. getPowerRecursive(3, 2)
//        //  3.a) return 3 * ( 3 * ( 3 ) ) ) * 3 * 3;
//        ///  = 3 * 3 * 3 * 3 * 3
//        ///  = 3 ^ 5 = 243
//    }
}
