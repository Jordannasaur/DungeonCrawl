public class Player extends Character {

    public int numAtkUpgrades, numDefUpgrades;
    int healthPotionsHeld, restsLeft;

    public String[] atkUpgrades = {"Splintering Strike", "Colossal Chop", "Cruel Slice", "Judgement's Blow"};
    public String[] defUpgrades = {"Wolf Skin", "Oak Flesh", "Stone Guard", "Angelic Defense"};

    public Player(String name) {

        super(name, 100, 0);

        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;

        this.healthPotionsHeld = 3;
        this.restsLeft = 1;
    }


    @Override
    public int attack() {
        int min = (int) Math.ceil(1);
        int max = (int) Math.floor(16);
        if (numAtkUpgrades == 0) {
            return (int) (Math.random() * (max - min) + min);
        }else if(numAtkUpgrades == 1){
            return (int) (Math.random() * ((max - min) + min + 5));
        }else if(numAtkUpgrades == 2){
            return (int) (Math.random() * ((max - min) + min + 10));}
        else if(numAtkUpgrades == 3){
            return (int) (Math.random() * ((max - min) + min + 15));}
        else {
            return (int) (Math.random() * ((max - min) + min + 20));}
    }




    public void chooseUpgrade() {
        GameLogic.clearConsole();
        GameLogic.printHeader("Choose an Upgrade:");
        System.out.println("1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("2) " + defUpgrades[numDefUpgrades]);
        int input = GameLogic.readInt("->", 2);
        GameLogic.clearConsole();

        if (input == 1) {
            GameLogic.printHeader("You chose Attack Upgrade!");
            numAtkUpgrades++;
        } else {
            GameLogic.printHeader("You chose Defense Upgrade!");
            numDefUpgrades++;
        }
        GameLogic.enterToContinue();
    }

}
