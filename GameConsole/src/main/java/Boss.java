public class Boss extends Character{

    public Boss(String name, int maxHp, int xp) {
        super(name, maxHp, xp);
    }

    @Override
    public int attack() {
        int min =(int) Math.ceil(10);
        int max = (int) Math.floor(30);
        return (int) (Math.random()*(max - min) + min);
    }
}
