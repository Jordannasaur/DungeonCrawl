import java.sql.SQLOutput;
import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;

    public static int defeatCount = 0;

    public static int place = 0, act = 1;

    public static String[] biomes = {"Haithmark Forest", "Khudurra Ruins", " Eckterre Chasm", "Grimvern Ice Wastes", "Gallabanar Swamp", "Durendreg Throne Room"};

    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.print(prompt);
            try {
                input = Integer.parseInt((scanner.next()));
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter a valid choice!");
            }

        } while (input < 1 || input > userChoices);
        return input;

    }

    public static void clearConsole() {
        for (int i = 0; i < 12; i++)
            System.out.println();

    }

    public static void printMenu() {
        clearConsole();
        printHeader(biomes[place]);
        System.out.println("Choose an action:");
        printSeperator(30);
        System.out.println("1) Continue your journey");
        System.out.println("2) Character Info");
        System.out.println("3) Exit Game");
    }

    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public static void printHeader(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    public static void printSplash() {
        System.out.println("                                                                                                                                                                                       \n" +
                "     _____     ____   ____   _____   ______          _____          ______            _____   _____   ______               _____         _____          _____      _____             ____        \n" +
                " ___|\\    \\   |    | |    | |\\    \\ |\\     \\     ___|\\    \\     ___|\\     \\      ____|\\    \\ |\\    \\ |\\     \\          ___|\\    \\    ___|\\    \\     ___|\\    \\    |\\    \\   _____   |    |       \n" +
                "|    |\\    \\  |    | |    |  \\\\    \\| \\     \\   /    /\\    \\   |     \\     \\    /     /\\    \\ \\\\    \\| \\     \\        /    /\\    \\  |    |\\    \\   /    /\\    \\   | |    | /    /|  |    |       \n" +
                "|    | |    | |    | |    |   \\|    \\  \\     | |    |  |____|  |     ,_____/|  /     /  \\    \\ \\|    \\  \\     |      |    |  |    | |    | |    | |    |  |    |  \\/     / |    ||  |    |       \n" +
                "|    | |    | |    | |    |    |     \\  |    | |    |    ____  |     \\--'\\_|/ |     |    |    | |     \\  |    |      |    |  |____| |    |/____/  |    |__|    |  /     /_  \\   \\/  |    |  ____ \n" +
                "|    | |    | |    | |    |    |      \\ |    | |    |   |    | |     /___/|   |     |    |    | |      \\ |    |      |    |   ____  |    |\\    \\  |    .--.    | |     // \\  \\   \\  |    | |    |\n" +
                "|    | |    | |    | |    |    |    |\\ \\|    | |    |   |_,  | |     \\____|\\  |\\     \\  /    /| |    |\\ \\|    |      |    |  |    | |    | |    | |    |  |    | |    |/   \\ |    | |    | |    |\n" +
                "|____|/____/| |\\___\\_|____|    |____||\\_____/| |\\ ___\\___/  /| |____ '     /| | \\_____\\/____/ | |____||\\_____/|      |\\ ___\\/    /| |____| |____| |____|  |____| |\\ ___/\\   \\|   /| |____|/____/|\n" +
                "|    /    | | | |    |    |    |    |/ \\|   || | |   /____ / | |    /_____/ |  \\ |    ||    | / |    |/ \\|   ||      | |   /____/ | |    | |    | |    |  |    | | |   | \\______/ | |    |     ||\n" +
                "|____|____|/   \\|____|____|    |____|   |___|/  \\|___|    | /  |____|     | /   \\|____||____|/  |____|   |___|/       \\|___|    | / |____| |____| |____|  |____|  \\|___|/\\ |    | | |____|_____|/\n" +
                "                                                     |____|/        |_____|/                                               |____|/                                        \\|____|/       ");

    }

    public static void printGameOver() {
        System.out.println("      _____           _____         ______  _______         ______                 _____      ____      ____       ______         _____   \n" +
                "  ___|\\    \\      ___|\\    \\       |      \\/       \\    ___|\\     \\           ____|\\    \\    |    |    |    |  ___|\\     \\    ___|\\    \\  \n" +
                " /    /\\    \\    /    /\\    \\     /          /\\     \\  |     \\     \\         /     /\\    \\   |    |    |    | |     \\     \\  |    |\\    \\ \n" +
                "|    |  |____|  |    |  |    |   /     /\\   / /\\     | |     ,_____/|       /     /  \\    \\  |    |    |    | |     ,_____/| |    | |    |\n" +
                "|    |    ____  |    |__|    |  /     /\\ \\_/ / /    /| |     \\--'\\_|/      |     |    |    | |    |    |    | |     \\--'\\_|/ |    |/____/ \n" +
                "|    |   |    | |    .--.    | |     |  \\|_|/ /    / | |     /___/|        |     |    |    | |    |    |    | |     /___/|   |    |\\    \\ \n" +
                "|    |   |_,  | |    |  |    | |     |       |    |  | |     \\____|\\       |\\     \\  /    /| |\\    \\  /    /| |     \\____|\\  |    | |    |\n" +
                "|\\ ___\\___/  /| |____|  |____| |\\____\\       |____|  / |____ '     /|      | \\_____\\/____/ | | \\ ___\\/___ / | |____ '     /| |____| |____|\n" +
                "| |   /____ / | |    |  |    | | |    |      |    | /  |    /_____/ |       \\ |    ||    | /  \\ |   ||   | /  |    /_____/ | |    | |    |\n" +
                " \\|___|    | /  |____|  |____|  \\|____|      |____|/   |____|     | /        \\|____||____|/    \\|___||___|/   |____|     | / |____| |____|\n" +
                "      |____|/                                               |_____|/                                               |_____|/  ");
    }

    public static void enterToContinue() {
        System.out.print("\nPress Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void startGame() {

        printSplash();

        boolean isNameSet = false;
        String name;

        enterToContinue();

        do {
            clearConsole();
            printHeader("What is your name adventurer?");
            name = scanner.next();
            clearConsole();
            printHeader("Your name is " + name + ".\nIs this correct?");
            System.out.println("1) Yes! Let's go!");
            System.out.println("2) No, that's not right..");
            int input = readInt("-> ", 2);
            if (input == 1) {
                isNameSet = true;
            }
        } while (!isNameSet);

        player = new Player(name);


        isRunning = true;

        StoryContents.Intro();
        StoryContents.Intro2();


        gameLoop();
    }

    public static void characterInfo() {
        clearConsole();
        printHeader("Character Info");
        System.out.println(player.name + "\nCurrent Health: " + player.hp + "/" + player.maxHp);
        printSeperator(30);
        System.out.println("Current XP: " + player.xp);
        printSeperator(30);
        System.out.println("Potions Held: " + player.healthPotionsHeld);
        printSeperator(30);
        enterToContinue();

    }


    public static void printBiomeList() {
        clearConsole();
        printHeader("Choose a Location");
        System.out.println("1) Ruins");
        System.out.println("2) Cave");
        System.out.println("3) Ices Wastes");
        System.out.println("4) Swamp");

    }

    public static void gameLoop() {
        while (isRunning) {
            printMenu();

            int input = readInt("-> ", 3);
            if (input == 1) {
                if (defeatCount < 1) {
                    StoryContents.Act1Intro();
                }
                continueJourney();
                if (defeatCount >= 1) {
                    StoryContents.ActContinues();
                }
            } else if (input == 2) {
                characterInfo();
            } else {
                clearConsole();
                printHeader("Thanks for playing!");
                isRunning = false;
            }
        }
    }

    public static void checkAct() {
        if (player.xp >= 50 && act == 1) {
            act = 2;
            place = 1;
            StoryContents.Act1Outro();

            StoryContents.Act2Intro();
        }
        if ((player.xp >= 100 && act == 2)) {
            act = 3;
            place = 2;
            StoryContents.Act2Outro();

            StoryContents.Act3Intro();
        }
        if ((player.xp >= 150 && act == 3)) {
            act = 4;
            place = 3;
            StoryContents.Act3Outro();

            StoryContents.Act4Intro();
        }
        if ((player.xp >= 200 && act == 4)) {
            act = 4;
            place = 3;
            StoryContents.Act3Outro();

            StoryContents.Act4Intro();
        }
        if ((player.xp >= 250 && act == 5)) {
            act = 5;
            place = 4;
            StoryContents.Act2Outro();

            StoryContents.Act3Intro();
        }
        if ((player.xp >= 300 && act == 6)) {
            act = 6;
            place = 5;
            StoryContents.Act2Outro();

            StoryContents.Act3Intro();
        }
    }

    public static void continueJourney() {
        checkAct();
        if (act == 1) {
            BattleLogic.randomEncounterForest();
        }
        if (act == 2) {
            BattleLogic.randomEncounterCave();
        }
        if (act == 3) {
            BattleLogic.randomBattleRuins();
        }
        if (act == 4) {
            BattleLogic.randomEncounterIceWastes();
        }
        if (act == 5) {
            BattleLogic.randomEncounterSwamp();
        }
        if (act == 6) {

        }
    }

    public static void checkBiome() {
        while (isRunning) {
            int input = readInt("-> ", 4);
            if (input == 1) {
                Biomes.Ruins();
                while (defeatCount < 10) {
                    if (defeatCount >= 1) {
                        Biomes.RuinsContinue();
                    }
                    enterToContinue();
                    BattleLogic.randomEncounterRuins();

                    if (defeatCount == 10) {
                        //  BattleLogic.bossfightRuins();
                    }
                    if (player.hp <= 0) {
                        break;
                    }
                }

            } else if (input == 2) {
                Biomes.Cave();
                while (defeatCount < 10) {
                    if (defeatCount >= 1) {
                        Biomes.CaveContinue();
                    }
                    enterToContinue();
                    BattleLogic.randomEncounterCave();
                    if (player.hp <= 0) {
                        break;
                    }
                }
            } else if (input == 3) {
                Biomes.IceWastes();
                while (defeatCount < 10) {
                    if (defeatCount >= 1) {
                        Biomes.IceWastesContinue();
                    }
                    enterToContinue();
                    BattleLogic.randomEncounterIceWastes();
                    if (player.hp <= 0) {
                        break;
                    }
                }
            } else if (input == 4) {
                Biomes.Swamp();
                while (defeatCount < 10) {
                    if (defeatCount >= 1) {
                        Biomes.SwampContinue();
                    }
                    enterToContinue();
                    BattleLogic.randomEncounterSwamp();
                    if (player.hp <= 0) {
                        break;
                    }
                }
            }
        }
    }
}
