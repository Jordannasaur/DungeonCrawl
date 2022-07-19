public class StoryContents {

    public static void Intro() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(70);
        System.out.println("The Black Wizard Zangreef has been freed after a 1,000 year slumber," +
                "\nand invades the castle town Durendreg. Our hero of this story, " +
                "\nthe Knight Captain, " + GameLogic.player.name + " is the first to challenge Zangreef." +
                "\nAfter a grueling battle, " + GameLogic.player.name + " inflicts a grievous wound on " +
                "\nThe Black Wizard, which forces Zangreef to teleport " + GameLogic.player.name + " away." +
                "\nThere none left who can stand against Zangreef and his dark army...");
        GameLogic.printSeperator(70);
        GameLogic.enterToContinue();
    }

    public static void Intro2() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(90);
        System.out.println("The Knight Captain " + GameLogic.player.name + " finds themself awaking in a strange forest," +
                "\nwith nothing but their sword, just as the sun begins to peek over the horizon." +
                "\n" + GameLogic.player.name + " looks up to the treetops, only to find a sky nearly filled with black clouds." +
                "\n\"This is not good! I must get back to Durendreg at once!\" " + GameLogic.player.name +" thinks to themself." +
                "\nThe Knight Captain begins their journey to defeat the Black Wizard...");
        GameLogic.printSeperator(90);
        GameLogic.enterToContinue();
    }

    public static void Act1Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println("\"I recognize this place, this is Haithmark Forest\" " + GameLogic.player.name + " mutters to themself," +
                "\n\"I must find a way out quickly!\" " +
                GameLogic.player.name + " traverses the forest slowly at first," +
                "\nunsure of what foul creatures may try to catch them unawares...");
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void ActContinues(){
        GameLogic.clearConsole();
        GameLogic.printHeader("After defeating the enemy " + GameLogic.player.name + " continues through the area...");
        GameLogic.enterToContinue();
    }


    public static void Act1Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println("Having defeated Khisha The Gryfaun, " + GameLogic.player.name + " Emerges from Haithmark Forest." +
                "\nFollowing the setting sun, The Knight Captain heads towards the city of Khudurra." +
                "\nAs the sun is about to full dive below the horizon, " +GameLogic.player.name + "finds a place to camp for the night.");
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Act2Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println("After a peaceful sleep, " + GameLogic.player.name + " continues their journey towards Khudurra."+
                "\nUpon arriving at the city, our hero is taken aback, when they see there is nothing left of the city," +
                "\nexcept rubble and smoke. " + GameLogic.player.name + " walks up to the edge of the debris only to find "+
                "\nA plethora of monsters waiting for their next meal..");
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Act2Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println("Kolchax The Skeletal Dread Lord put up a good fight, but it was no match for " + GameLogic.player.name + "." +
                           "\nHaving cleared Khudurra Ruins of the evil dwelling inside, our hero ventures forth towards their homeland." +
                            "\nUpon the horizon, " + GameLogic.player.name + " spots the Eckterre Chasm, which separates the country.");
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Act3Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println(GameLogic.player.name + " finally makes it to the base of the Eckterre Mountains." +
                           "\nThe Knight Captain sighs upon seeing the many cavern entrances, all of which seem foreboding." +
                           "\nOur hero decides on an entrance, and begins the long dark trek through the Eckterre Chasm." );
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Act3Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println("After a long and brutal battle with the Black Dragon Andorath the Shadow Eater, " + GameLogic.player.name +
                           "\nemerges victorious. With Andorath's defeat, a path opens up behind the dragon's hoard." +
                           "\n\"Hopefully this will get me out of here.. I am running out of time!\"" + GameLogic.player.name + " thinks.") ;
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Act4Intro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println("Finally emerging from the dark twisting tunnels of the Eckterre Chasm " + GameLogic.player.name +
                           "\nis greeted by the sight of a vast frozen tundra know as the Grimvern Ice Wastes." +
                           "\n\"This land is home to the Frost Giants as well as many other icy fiends, I must tread" +
                           "\nwith caution." + GameLogic.player.name + "thinks, as they take the first steps through the tundra.");
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Act4Outro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(80);
        System.out.println();
        GameLogic.printSeperator(80);
        GameLogic.enterToContinue();
    }

    public static void Rest(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(53);
        System.out.println("You come across a secluded area, perfect for a rest");
        GameLogic.printSeperator(53);
    }

}
