
public class PlayerMonster {
    private String name;
    private int numberOfCards;
    private Monster[] monstersToPlayWith= new Monster[3];
    int randomMonster = (int) (Math.random() * monstersToPlayWith.length);


    public PlayerMonster(String name, int numberOfCards, Monster[] monstersToPlayWith) {
        this.name = name;
        this.numberOfCards = numberOfCards;
        this.monstersToPlayWith = monstersToPlayWith;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public Monster[] getMonstersToPlayWith() {
        return monstersToPlayWith;
    }

    public void chooseMonsterToAttack(Monster[] monstersToPlayWith) {
        int monsterToAttack = (int) (Math.random() * monstersToPlayWith.length);
        Monster chosenToAttack = monstersToPlayWith[monsterToAttack];
        if (chosenToAttack.getLife() > 0) {
            chosenToAttack.attack(chosenToAttack.getLife(), monstersToPlayWith[randomMonster]);
        }
    }

    public void chooseMonsterToDefend(Monster[] monstersToPlayWith) {
        Monster monsterChosen = monstersToPlayWith[randomMonster];
        System.out.println("Monster to defend is" + monsterChosen.toString());

    }
}
