public class Main {
    public static void main(String[] args) {
        PlayerMonster player;
        Monster[] monstersP1 = {new Werewolf(100), new Werewolf(100), new Mummy(100)};
        Monster[] monstersP2 = {new Mummy(100), new Werewolf(100), new Vampire(100)};
        PlayerMonster p1 = new PlayerMonster("Cláudia", 3, monstersP1);
        PlayerMonster p2 = new PlayerMonster("Tiago", 3, monstersP2);
        Game game1 = new Game(monstersP1, monstersP2, p1, p2);
        game1.start();
        game1.determineWinner(monstersP1, monstersP2);
    }
}





