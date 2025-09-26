public class Werewolf extends Monster {
    private int damage=20;

    public Werewolf(int life, int damage) {
        super(life);
        this.damage = damage;

    }

    public Werewolf(int life) {
        super(life);
    }

    @Override
    public void attack (int life, Monster monster2){
        if (life>0){
            System.out.println("Werewolf attacks");
            monster2.setLife(monster2.getLife()-damage);
        }
    }
}
