public class Game {
    private PlayerMonster player;
    private Monster[] monstersP1 = {new Werewolf(100), new Werewolf(100), new Mummy(100)};
    private Monster[] monstersP2 = {new Mummy(100), new Werewolf(100), new Vampire(100)};
    PlayerMonster p1 = new PlayerMonster("Cláudia", 3, monstersP1);
    PlayerMonster p2 = new PlayerMonster("Tiago", 3, monstersP2);

    public Game(Monster[] monstersP1, Monster[] monstersP2, PlayerMonster p1, PlayerMonster p2) {
        this.monstersP1 = monstersP1;
        this.monstersP2 = monstersP2;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        if (p1.getNumberOfCards() == p2.getNumberOfCards()) {
            System.out.println("Game starts");
        } else {
            System.out.println("Try again");
        }
    }

    public void determineWinner(Monster [] monstersP1, Monster []monstersP2) {
        if (p1.getNumberOfCards() == 0) {
            System.out.println(p2.getName() + "wins!!!");
        }
        if (p2.getNumberOfCards() == 0) {
            System.out.println(p1.getName() + "wins!!!!");
        }
        for (int i = 0; i < 10; i++) {
            if (i / 2 == 0) {
                p1.chooseMonsterToAttack(monstersP1);
                p2.chooseMonsterToDefend(monstersP2);
            }
            if (i / 2 != 0) {
                p2.chooseMonsterToAttack(monstersP2);
                p1.chooseMonsterToDefend(monstersP1);
            }
        }

    }
}
