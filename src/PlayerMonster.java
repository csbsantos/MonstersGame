
public class PlayerMonster {
    private String name;
    private int numberOfCards;
    private Monster [] monstersToPlayWith;

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

    public void chooseMonsterToAttack(Monster [] monstersToPlayWith){
//if (monstersToPlayWith[int i].getLife()>0){
//    monstersToPlayWith[0].attack();
}
    }

//    public void chooseMonsterToDefend (Monster [] monstersToPlayWith){
//        int randomMonster= (int) (Math.random()*monstersToPlayWith.length);
//            String monsterChosen= monstersToPlayWith[randomMonster].toString();
//            System.out.println("Monster to defend is" + monsterChosen);
//
//        }
    }
