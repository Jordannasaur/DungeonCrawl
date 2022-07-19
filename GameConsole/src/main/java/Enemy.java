public class Enemy extends Character {

    int playerXp;


    public Enemy(String name, int playerXp) {

        super(name, (int) (Math.random() * playerXp + playerXp / 3 + 5),
                (int) (Math.random() * (playerXp / 4 + 2) + 2));

        this.playerXp = playerXp;
    }

    @Override
    public int attack() {
        int min =(int) Math.ceil(1);
        int max = (int) Math.floor(16);
        return (int) (Math.random()*(max - min) + min);

    }
}
