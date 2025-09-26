public class Mummy extends Monster{
    private int numberOfAttacks;
    private int damage;

    public Mummy(int life, int numberOfAttacks, int damage) {
        super(life);
        this.numberOfAttacks = 0;
        this.damage = 40;
    }

    public Mummy(int life) {
        super(life);
    }

    public int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public int getDamage() {
        return damage;
    }
    @Override
    public void attack(int life, Monster monster2){
        if (numberOfAttacks/3==0){
            System.out.println("Sorry, but Mummy can't attack this time");
            int newLife= life-10;
        }else{
            System.out.println("Mummy attacks!");
            monster2.setLife(life-damage);
        }
    }
}
