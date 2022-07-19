public class BattleLogic {


    public static int locationsCompleted = 0;
    public static String[] encounterType = {"Battle", "Battle", "Battle", "Battle", "Battle", "Battle", "Battle", "Battle", "Battle", "Battle", "Battle", "Rest", "Rest"};

    public static String[] enemiesForest = {"Giant Spider", "Treant", "Goblin", "Bandit", "Dire Wolf", "Troll", "Wraith", "Spectre", "Bear", "Wood Golem"};//Khisha The Gryfaun
    public static String[] enemiesRuins = {"Skeleton", "Zombie", "Jelly", "Goblin", "Gargoyle", "Thrall", "Warlock", "Thief", "Assassin", "Troll"};//Kolchax Skeletal Dread Lord
    public static String[] enemiesCave = {"Skeleton", "Bear", "Goblin", "Orc", "Troll", "Giant Bat", "Stone Golem", "Vampire", "Basilisk", "Giant Spider"};//Boss: Black Dragon Andorath The Shadow Eater
    public static String[] enemiesIceWastes = {"Ice Wraith", "Frost Atronach", "Snow Golem", "Winter Wolf", "Frost Troll", "Barbarian", "Frost Giant", "Polar Bear", "Yeti", "Ice Salamander"};//Boss: Fevnar The Frost Giant King
    public static String[] enemiesSwamp = {"Witch", "Giant Mosquito", "Will-O-Wisp", "Poisonous Blob", "Crocodile", "Swamp Thing", "Mud Golem", "Giant Snake", "Mandragora", "Salamander"};//Boss: Braszk The Lizard Sentinel

    public static void randomEncounterForest() {
        int encounter = (int) (Math.random() * encounterType.length);

        if (encounterType[encounter].equals("Battle")) {
            randomBattleForest();
        } else if (encounterType[encounter].equals("Rest")) {
            restAndHeal();
        }
    }

    public static void randomEncounterCave() {
        int encounter = (int) (Math.random() * encounterType.length);

        if (encounterType[encounter].equals("Battle")) {
            randomBattleCave();
        } else if (encounterType[encounter].equals("Rest")) {
            restAndHeal();
        }
    }

    public static void randomEncounterRuins() {
        int encounter = (int) (Math.random() * encounterType.length);

        if (encounterType[encounter].equals("Battle")) {
            randomBattleRuins();
        } else if (encounterType[encounter].equals("Rest")) {
            restAndHeal();
        }
    }

    public static void randomEncounterIceWastes() {
        int encounter = (int) (Math.random() * encounterType.length);

        if (encounterType[encounter].equals("Battle")) {
            randomBattleIceWastes();
        } else if (encounterType[encounter].equals("Rest")) {
            restAndHeal();
        }
    }

    public static void randomEncounterSwamp() {
        int encounter = (int) (Math.random() * encounterType.length);

        if (encounterType[encounter].equals("Battle")) {
            randomBattleSwamp();
        } else if (encounterType[encounter].equals("Rest")) {
            restAndHeal();
        }
    }

    public static void randomBattleForest() {
        GameLogic.clearConsole();
        GameLogic.printHeader("A dangerous foe appears, you prepare to fight!");
        GameLogic.enterToContinue();
        battle(new Enemy(enemiesCave[(int) (Math.random() * enemiesCave.length)], GameLogic.player.xp));
    }

    public static void randomBattleCave() {
        GameLogic.clearConsole();
        GameLogic.printHeader("A dangerous foe appears, you prepare to fight!");
        GameLogic.enterToContinue();
        battle(new Enemy(enemiesCave[(int) (Math.random() * enemiesCave.length)], GameLogic.player.xp));

    }

    public static void randomBattleRuins() {
        GameLogic.clearConsole();
        GameLogic.printHeader("A dangerous foe appears, you prepare to fight!");
        GameLogic.enterToContinue();
        battle(new Enemy(enemiesRuins[(int) (Math.random() * enemiesRuins.length)], GameLogic.player.xp));

    }

    public static void randomBattleIceWastes() {
        GameLogic.clearConsole();
        GameLogic.printHeader("A dangerous foe appears, you prepare to fight!");
        GameLogic.enterToContinue();
        battle(new Enemy(enemiesIceWastes[(int) (Math.random() * enemiesIceWastes.length)], GameLogic.player.xp));

    }

    public static void randomBattleSwamp() {
        GameLogic.clearConsole();
        GameLogic.printHeader("A dangerous foe appears, you prepare to fight!");
        GameLogic.enterToContinue();
        battle(new Enemy(enemiesSwamp[(int) (Math.random() * enemiesSwamp.length)], GameLogic.player.xp));

    }

    public static void restAndHeal() {
        GameLogic.clearConsole();
        if (GameLogic.player.restsLeft >= 1) {
StoryContents.Rest();
            GameLogic.printSeperator(34);
            System.out.println("Would you like to rest and heal? "
                    + "\nYou have: " + GameLogic.player.restsLeft + " rest(s) left.");
            GameLogic.printSeperator(34);
            System.out.println("1)Yes, I'm tired!\n2)No, I'm okay!");
            int input = GameLogic.readInt("->", 2);
            if (input == 1) {
                GameLogic.clearConsole();
                if (GameLogic.player.hp < GameLogic.player.maxHp) {
                    int hpRestored = GameLogic.player.maxHp - GameLogic.player.hp;
                    GameLogic.player.hp += hpRestored;
                    if (GameLogic.player.hp > GameLogic.player.maxHp) {
                        GameLogic.player.hp = GameLogic.player.maxHp;
                        System.out.println("You had a nice rest and restored " + hpRestored + " HP!");
                        System.out.println("Your health is now full!");
                        GameLogic.player.restsLeft--;
                    } else {
                        System.out.println("Your health is full! Rest after losing some health!");
                        GameLogic.enterToContinue();
                    }
                }
            }
        }

    }

    public static void battle(Enemy enemy) {
        while (true) {
            GameLogic.clearConsole();
            GameLogic.printHeader(enemy.name + "'s" + " HP: " + enemy.hp + "/" + enemy.maxHp);
            GameLogic.printHeader(GameLogic.player.name + "'s" + " HP: " + GameLogic.player.hp + "/" + GameLogic.player.maxHp);
            System.out.println("Choose an action:");
            GameLogic.printSeperator(30);
            System.out.println("1) Attack \n2) Use Potion \n3) Character Info \n4) Run Away");
            int input = GameLogic.readInt("->", 4);
            if (input == 1) {
                int damageDealt = GameLogic.player.attack();
                int damageTaken = enemy.attack();
                GameLogic.player.hp -= damageTaken;
                enemy.hp -= damageDealt;
                GameLogic.clearConsole();
                GameLogic.printHeader("Battle Status:");
                System.out.println(GameLogic.player.name + " dealt " + damageDealt + " damage to the " + enemy.name);
                GameLogic.printSeperator(30);
                System.out.println(GameLogic.player.name + " took " + damageTaken + " damage from the " + enemy.name);
                GameLogic.enterToContinue();

                if (GameLogic.player.hp <= 0) {
                    playerDied();
                    break;
                } else if (enemy.hp <= 0) {
                    GameLogic.defeatCount++;
                    GameLogic.clearConsole();
                    GameLogic.printHeader("Congrats, " + GameLogic.player.name + "! You defeated the " + enemy.name);
                    GameLogic.player.xp += enemy.xp;
                    System.out.println(GameLogic.player.name + ", you gained " + enemy.xp + " XP!");
                    GameLogic.printSeperator(30);
                    System.out.println("You have defeated " + GameLogic.defeatCount + " enemies so far!");
                    GameLogic.printSeperator(30);
                    GameLogic.enterToContinue();
                    break;
                }

            } else if (input == 2) {
                usePotion();
            } else if (input == 3) {
                GameLogic.clearConsole();
                GameLogic.characterInfo();
                continue;
            } else if (input == 4) {
                GameLogic.clearConsole();
                if (Math.random() * 10 + 1 <= 5) {
                    GameLogic.printHeader("Like a coward you run from the " + enemy.name + ".");
                    GameLogic.enterToContinue();
                    break;
                } else {
                    GameLogic.printHeader("The " + enemy.name + " blocks you path and you cannot escape!");
                    GameLogic.enterToContinue();
                }
            }
        }
    }

    public static void playerDied() {
        GameLogic.clearConsole();
        GameLogic.printGameOver();
        GameLogic.enterToContinue();
        GameLogic.printHeader("You defeated " + GameLogic.defeatCount + " enemies during your adventure!");
        GameLogic.printHeader("Thank you for playing! Please try again!");
        GameLogic.isRunning = false;

    }

    public static void usePotion() {
        GameLogic.clearConsole();
        if (GameLogic.player.healthPotionsHeld > 0) {
            if (GameLogic.player.hp < GameLogic.player.maxHp) {
                int hpRestored = 25;
                GameLogic.player.hp += hpRestored;
                GameLogic.player.healthPotionsHeld--;
                if (GameLogic.player.hp > GameLogic.player.maxHp) {
                    GameLogic.player.hp = GameLogic.player.maxHp;
                    GameLogic.printHeader("The potion restored you to full health!");
                    GameLogic.enterToContinue();
                } else {
                    GameLogic.printSeperator(30);
                    System.out.println("The potion restored " + hpRestored + " HP!");
                    GameLogic.printSeperator(30);
                    System.out.println(GameLogic.player.name + "'s  current health: " + GameLogic.player.hp + "/" + GameLogic.player.maxHp + " HP!");
                    GameLogic.printSeperator(30);
                    System.out.println(GameLogic.player.name + " has " + GameLogic.player.healthPotionsHeld + " potions left!");
                    GameLogic.printSeperator(30);
                    GameLogic.enterToContinue();
                }
            } else {
                GameLogic.printHeader("You are at full health!");
                GameLogic.enterToContinue();
            }
        } else {
            GameLogic.printHeader("You don't have any potions left!");
            GameLogic.enterToContinue();
        }

    }
}
