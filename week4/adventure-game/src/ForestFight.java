import java.util.Random;
public class ForestFight extends GamePlay {


    Random rand = new Random();
    private final int starter = rand.nextInt(1,3);


    TwoHeadedDeer deer = new TwoHeadedDeer();
    public void forestFight(){
        gameStarter();
        System.out.println("You are face to face with legendary two headed deer.");
        dialogSleeper2000();
        System.out.println("It has such capabilities...");
        bracketEquals();
        statsDeer();
        System.out.println("Who is going to attack first?");
        dialogSleeper2000();
        fightMechanic();
    }

    public void statsDeer(){
        bracketEquals();
        System.out.println("Monster name: " + deer.getMonsterName());
        dialogSleeper2000();
        System.out.println("Monster health: " + deer.getMonsterHealth());
        dialogSleeper2000();
        System.out.println("Monster damage: " + deer.getMonsterDamage());
        bracketEquals();
    }



    public void fightMechanic(){

        int yourDamage = getUserDamage(); // Damage Health 0
        switch (starter){
            case 1:
                System.out.println("You hit first!");
                while (true){
                    int deerDamage = rand.nextInt(30,51);
                    switch (getUserChoice()){
                        case 1:
                            yourDamage = rand.nextInt(20,31);
                            break;
                        case 2:
                            yourDamage = rand.nextInt(50,101);
                            break;
                        case 3:
                            yourDamage = rand.nextInt(90,151);
                            break;
                        case 4:
                            yourDamage = rand.nextInt(30,51);
                            break;
                    }
                    int userHealthCalculate;
                    int monsterHealthCalculate;
                    do {


                        System.out.println("You opened an small hole with your sword on it's head!");
                        monsterHealthCalculate = deer.getMonsterHealth() - yourDamage;
                        deer.setMonsterHealth(monsterHealthCalculate);
                        System.out.println("Deer has " + monsterHealthCalculate + " hp left!");
                        System.out.println("It scratches your face with it's horns!");
                        userHealthCalculate = getUserHealth() - deerDamage;
                        setUserHealth(userHealthCalculate);
                        System.out.println("You have " + userHealthCalculate + " hp left!");
                        if (monsterHealthCalculate < 0){
                            System.out.println("WOW! You win but you are exhausted... You are eating the healing herb... It increased your health...");
                            setUserHealth(userHealthCalculate + 100);
                            marketLoop();
                            break;
                        } else if (userHealthCalculate < 0) {
                            System.out.println("YOU ARE DIED... GAME OVER...");
                            break;
                        }
                    }while (userHealthCalculate > 0 || monsterHealthCalculate > 0);

                   break;
                }
                break;
            case 2:
                System.out.println("Deer horned you first!");
                while (true){
                    int deerDamage = rand.nextInt(0,51);

                    switch (getUserChoice()){
                        case 1:
                            yourDamage = rand.nextInt(0,31);
                            break;
                        case 2:
                            yourDamage = rand.nextInt(0,101);
                            break;
                        case 3:
                            yourDamage = rand.nextInt(0,151);
                            break;
                        case 4:
                            yourDamage = rand.nextInt(0,51);
                            break;
                    }
                    int userHealthCalculate;
                    int monsterHealthCalculate;
                    do {

                        monsterHealthCalculate = deer.getMonsterHealth() - yourDamage;
                        deer.setMonsterHealth(monsterHealthCalculate);
                        System.out.println("Deer has " + monsterHealthCalculate + " hp left!");
                        System.out.println("It scratches your face with it's horns!");
                        userHealthCalculate = getUserHealth() - deerDamage;
                        setUserHealth(userHealthCalculate);
                        System.out.println("You have " + userHealthCalculate + " hp left!");
                        if (monsterHealthCalculate < 0){
                            System.out.println("WOW! You win but you are exhausted... You are eating the healing herb... It increased your health...");
                            setUserHealth(userHealthCalculate + 100);
                            marketLoop();
                            break;
                        } else if (userHealthCalculate < 0) {
                            System.out.println("YOU ARE DIED... GAME OVER...");
                            break;
                        }
                    }while (userHealthCalculate > 0 || monsterHealthCalculate > 0);

                    break;
                }
            break;
        }
    }
}
