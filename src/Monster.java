public abstract class Monster {
private int life;

    public Monster(int life) {
        this.life = 100;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String defend (int life){
        int newLife= life-20;
        return "Life updated into: " + newLife;
    }

    public abstract void attack(int life, Monster monster2);
}
