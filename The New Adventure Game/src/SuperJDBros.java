import java.util.Random;
import java.util.Scanner;

public class SuperJDBros {

    public static void main(String[] args) {


        choosePlayer();
        nextLevelTwo();
    }

    public static void choosePlayer() {
        Scanner pickPlayer = new Scanner(System.in);
        // function has to run in void Main in order to print out
        System.out.println("Which player would you like to continue with?");
        String playerOption = pickPlayer.nextLine();
        Scanner askToContinue = new Scanner(System.in);
//        // Here, you'll pick a player with either A or B
//        // if statement lets player choose A or B
//        // output is supposed to let player play with player 1
//        // add super secret items if they play again
        String playerA = "";
        String playerB = "";
        if (playerOption.equals("A")) {
            playerA = "Jario";
            System.out.println("By pressing A,you have chosen " + playerA + "!");
            System.out.println("Do you want to continue? [y/n]");
            String userChoice = askToContinue.next();
            if (userChoice.equalsIgnoreCase("Y")) {

            }
        } else {
            if (playerOption.equals("B")) {
                playerB = "Darluigi";
                System.out.println("By pressing B, you have chosen " + playerB + "!");
            }
        }
    }

    public static void nextLevelTwo() {
        Random randLvl = new Random();
        int upperbound = 10;
        Scanner askToContinue = new Scanner(System.in);
        int nextLvl = 2;
        int int_random = randLvl.nextInt(upperbound);
        for (int i = 0; i < upperbound; i++) {
            if (int_random < upperbound) {
                System.out.println("Don't move to level " + nextLvl + " [" + int_random + "/" + upperbound + " points]");
                System.out.println("Do you want to continue? [y/n]");
                String userChoice = askToContinue.next();
                if (userChoice.equalsIgnoreCase("Y")) {
                    int_random++;
                } else {
                    System.out.println("Goodbye!");
                    break;
                }
            } else {
                System.out.println("SUCCESS! Move to level " + nextLvl++); // incementing next level for the next round of point accumulation
                break;
            }
        }
    }

        public static void nextLevelThree() {
            Random randLvlTwo = new Random();
            int anotherLevel = 20;
            Scanner askToContinueAgain = new Scanner(System.in);
            int nextLvl3 = 2;
            int int_random = randLvlTwo.nextInt(anotherLevel);
            for (int i = 0; i < anotherLevel; i++) {
                if (int_random < anotherLevel) {
                    System.out.println("Don't move to level " + nextLvl3 + " [" + int_random + "/" + anotherLevel + " points]");
                    System.out.println("Do you want to continue? [y/n]");
                    String userChoice = askToContinueAgain.next();
                    if (userChoice.equalsIgnoreCase("Y")) {
                        int_random++;
                    } else {
                        System.out.println("Goodbye!");
                        break;
                    }
                } else {
                    System.out.println("SUCCESS! Move to level " + nextLvl3++); // incementing next level for the next round of point accumulation
                    break;
                }
            }
        }
    }

