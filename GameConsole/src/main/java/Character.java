public abstract class Character {


    //Attributes for all Characters
    public String name;
    public int maxHp, hp, xp;


    //Character Constructor
    public Character(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.xp = xp;
    }

    public abstract int attack();


}









//public class Boss {
//    if (bossFightOption.equals("1")) {
//        System.out.println("  You approach the boss ready for a tough fight!");
//        int bossHealth = rand.nextInt(bossMaxHealth);
//        String boss = bosses[rand.nextInt(enemies.length)];
//        System.out.println("\t# A " + boss + " appeared! #\n");
//
//        while (bossHealth > 0) {
//            System.out.println("\tYour HP: " + playerHealth);
//            System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
//            System.out.println("\n\tChoose an action:");
//            System.out.println("\t1: Attack");
//            System.out.println("\t2: Heal");
//            System.out.println("\t3: Run");
//
//            String actionInput = userInput.nextLine();
//
//            if (actionInput.equals("1")) {
//                int damageDealt = rand.nextInt(playerDamage);
//                int damageTaken = rand.nextInt(bossMaxAttack);
//
//                enemyHealth -= damageDealt;
//                playerHealth -= damageTaken;
//
//                System.out.println("\tYou attack the " + enemy + " for " + damageDealt + " damage!");
//                System.out.println("\tYou receive " + damageTaken + " damage from the " + enemy + "'s attack!");
//
//                if (playerHealth < 1) {
//                    System.out.println("------------------------------");
//                    System.out.println("\tYou have taken too much damage, and cannot continue!");
//                    break;
//                }
//
//            } else if (bossFightOption.equals("2")) {
//                System.out.println("You exit the Dungeon, successful from you adventures!");
//                break;
//            }
//        }
//    }
//}
