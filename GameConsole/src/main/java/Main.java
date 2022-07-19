import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameLogic.startGame();
    }
}


//
//    public static void main(String[] args) {
//
//        //System Objects
//        Scanner userInput = new Scanner(System.in);
//
//
//
//
//
//
//        //Basic Enemy Variables
//        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Jelly"};
//        int maxEnemyHealth = 50;
//        int enemyAttackDamage = 20;
//        int defeatCount = 0;
//
//        //Boss Variables
//        String[] bosses = {"Dread Lord"};
//        int bossMaxHealth = 200;
//        int bossMaxAttack = 40;
//
//        //Player Variables
//        // int playerHealth = 100;
//        int playerDamage = 40;
//        // int healthPotionHeld = 3;
//        // int healthPotHealAmt = 25;
//        int healthPotDropChance = 50; //percent chance
//        int currentExp = 0;
//        int expGain = 15;
//
//
//        boolean running = true;
//
//
//        System.out.println("        ###########################");
//        System.out.println("        #Welcome to Dungeon Crawl!#");
//        System.out.println("        ###########################");
//        System.out.println("Rules: Fight monsters to advance.\n"
//                + "\t   Defeat 10 enemies to fight the boss.\n"
//                + "\t   Defeat the boss to move to the next area!");
//
//        GAME:
//        while (running) {
//            System.out.println("------------------------------------------");
//
//
//            String enemy = enemyAppears();
//            System.out.println("\t# A " + enemy + " appeared! #\n");
//
//            while (Character.enemyHealth > 0) {
//                System.out.println("\tYour HP: " + Character.playerHealth);
//                System.out.println("\t" + enemy + "'s HP: " + Character.enemyHealth);
//                System.out.println();
//                System.out.println("\t1: Attack");
//                System.out.println("\t2: Heal");
//                System.out.println("\t3: Run");
//                System.out.print("\tChoose an action: ");
//
//
//                String actionInput = userInput.nextLine();
//
//                if (actionInput.equals("1")) {
//
//                    playerAttacks();
//
//                        if (Character.playerHealth < 1) {
//                            break;
//                        }
//                        if (Character.enemyHealth < 1) {
//                            defeatCount++;
//                            int expGained = Character.rand.nextInt(expGain - Character.minimumRandom + 1) + Character.minimumRandom;
//                            currentExp = currentExp + expGained;
//                            System.out.println(" # " + enemy + " was defeated! # ");
//                            System.out.println(" # You gained " + expGained + " EXP! #");
//                            // System.out.println("\tEnemies defeated: " + defeatCount);
//                        }
//
//                } else if (actionInput.equals("2")) {
//                    healPlayer();
//
//                } else if (actionInput.equals("3")) {
//                    System.out.println("\tLike a coward, you abandon the fight against the " + enemy + "!");
//                    continue GAME;
//
//                } else {
//                    System.out.println("------------------------------------------");
//                    System.out.println("\tInvalid command!");
//                    System.out.println("------------------------------------------");
//                }
//            }
//            if (Character.playerHealth < 1) {
//                System.out.println("\tYou take too much damage, and must restart");
//                System.out.println("------------------------------------------");
//                break;
//            }
//
//            System.out.println("------------------------------------------");
//            System.out.println(" # You have " + Character.playerHealth + " HP left! # ");
//            System.out.println(" # Enemies defeated: " + defeatCount + " # ");
//
//            System.out.println(" # Your current EXP is  " + currentExp + " # ");
//            if (Character.rand.nextInt(100) < healthPotDropChance) { // if random number is less than DropChance it will drop a potion
//                Character.healthPotionHeld++;
//                System.out.println(" # The " + enemy + " dropped a potion! # ");
//                System.out.println(" # You now have " + Character.healthPotionHeld + " potion(s)! # ");
//            }
//
//            if (currentExp >= 100) {
//                System.out.println();
//                System.out.println("------------------------------------------");
//                System.out.println(" # Congratulations! You leveled up! # ");
//                System.out.println(" # You're Health and Attack have increased! # ");
//                System.out.println("------------------------------------------");
//                currentExp = currentExp - 100;
//                Character.playerHealth = Character.playerHealth + 10;
//                playerDamage = playerDamage + 10;
//                continue;
//            }
////            if (defeatCount == 10) {
////                System.out.println("------------------------------");
////                System.out.println("This Dungeon's boss has appeared!");
////                System.out.println("------------------------------");
////                System.out.println("1: Fight the boss!");
////                System.out.println("2: Leave the Dungeon");
////                System.out.print("What would you like to do? ");
//
////                String bossFightOption = userInput.nextLine();
////
////                while (!bossFightOption.equals("1") && !bossFightOption.equals("2")) {
////                    System.out.println("Invalid command");
////                    bossFightOption = userInput.nextLine();
////                }
//            /* start boss fight, code in boss class */
//
////            }
//            else {
//
//                System.out.println("------------------------------------------");
//
//                System.out.println("1: Continue the fight!");
//                System.out.println("2: Leave the Dungeon");
//                System.out.print("What would you like to do? ");
//            }
//            String endGameOption = userInput.nextLine();
//
//            while (!endGameOption.equals("1") && !endGameOption.equals("2")) {
//                System.out.println("Invalid command");
//                endGameOption = userInput.nextLine();
//            }
//            if (endGameOption.equals("1")) {
//                System.out.println("------------------------------------------");
//                System.out.println("  You continue your adventure");
//            } else if (endGameOption.equals("2")) {
//                System.out.println("You exit the Dungeon, successful from you adventures!");
//                break;
//            }
//        }
//        System.out.println("#####################");
//        System.out.println("#Thanks for playing!#");
//        System.out.println("#####################");
//
//
//    }
//
//    static void healPlayer() {
//
//
//        if (Character.healthPotionHeld > 0) {
//            Character.playerHealth += Character.healthPotHealAmt;
//            if (Character.playerHealth > 100) {
//                Character.playerHealth = 100;
//                System.out.println("\tYour health cannot go above your max HP! Max HP: " + Character.playerHealth);
//                System.out.println("------------------------------------------");
//            }
//            Character.healthPotionHeld--;
//            System.out.println("\tYou drink one potion and heal " + Character.healthPotHealAmt + " HP!"
//                    + "\n\tYou now have: " + Character.playerHealth + " HP!" +
//                    "\n\t" + "potions left: " + Character.healthPotionHeld + "\n");
//            System.out.println("------------------------------------------");
//        } else {
//            System.out.println("\tYou have no potions left. Defeat enemies to find more!");
//        }
//    }
//
//    public static void playerAttacks() {
//        Random rand = new Random();
//        int minimumRandom = 1;
//        int enemyHealth = rand.nextInt(Character.maxEnemyHealth - minimumRandom + 1) + minimumRandom;
//        int damageDealt = rand.nextInt(Character.playerDamage - minimumRandom + 1) + minimumRandom;
//        int damageTaken = rand.nextInt(Character.enemyAttackDamage - minimumRandom + 1) + minimumRandom;
//     //   String enemy = enemyAppears();
//
//        Character.enemyHealth = enemyHealth - damageDealt;
//        Character.playerHealth -= damageTaken;
//
//
//        System.out.println("\n\tYou attack the monster" + " for " + damageDealt + " damage!");
//        System.out.println("\tYou receive " + damageTaken + " damage from the monster"  + "'s attack!");
//        System.out.println("------------------------------------------");
//
//
//    }
//
////    public static String enemyAppears() {
////        Random rand = new Random();
////        String enemy = Character.enemies[rand.nextInt(Character.enemies.length)];
////
////        return enemy;
////    }
//}
//
//
