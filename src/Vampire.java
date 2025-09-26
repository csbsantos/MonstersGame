public class Vampire extends Monster {
    private int damage=30;
    private double probabilityToBite= Math.random();

    public Vampire(int life, int damage, double probabilityToBite) {
        super(life);
        this.damage = damage;
        this.probabilityToBite = probabilityToBite;
    }

    public Vampire(int life) {
        super(life);
    }

    public int getDamage() {
        return damage;
    }

    public double getProbabilityToBite() {
        return probabilityToBite;
    }
    @Override
    public void attack(int life, Monster monster2){
        if (probabilityToBite>0.2){
            System.out.println("Vampire bites");
            setLife(life+50);
        }else{
            if (life>0){
                System.out.println("Vampire attacks");
                monster2.setLife(life-damage);
            }
        }
    }
}
