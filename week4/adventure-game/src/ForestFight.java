import java.util.Random;

public class ForestFight extends GamePlay{

    Random rand = new Random();
    private final int starter1 = rand.nextInt(1,3);


    TwoHeadedDeer deer = new TwoHeadedDeer();
    public void forestFight(){

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
        int yourDamage = 0;
        switch (starter1){
            case 1:
                System.out.println("You hit first!");
                while (true){
                    int deerDamage = rand.nextInt(0,51);

                    switch (getUserChoice()){
                        case 1:
                            yourDamage = rand.nextInt(0,31);
                            break;
                        case 2:
                            yourDamage = rand.nextInt(0,101);
                        case 3:
                            yourDamage = rand.nextInt(0,151);
                        case 4:
                            yourDamage = rand.nextInt(0,51);
                    }
                    System.out.println("You opened an small hole with your sword on it's head!");
                    int monsterHealthCalculate = deer.getMonsterHealth() - yourDamage;
                    System.out.println("Deer has " + monsterHealthCalculate + " hp left!");
                    System.out.println("It scratches your face with it's horns!");
                    int userHealthCalculate = getUserHealth() - deerDamage;
                    System.out.println("You have " + userHealthCalculate + " hp left!");
                    if (monsterHealthCalculate < 0){
                        System.out.println("WOW! You win but you are exhausted...");
                        break;
                    } else if (userHealthCalculate < 0) {
                        System.out.println("YOU ARE DIED... GAME OVER...");
                        break;
                    }
                }
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
                        case 3:
                            yourDamage = rand.nextInt(0,151);
                        case 4:
                            yourDamage = rand.nextInt(0,51);
                    }
                    System.out.println("You opened an small hole with your sword on it's head!");
                    int monsterHealthCalculate = deer.getMonsterHealth() - yourDamage;
                    System.out.println("Deer has " + monsterHealthCalculate + " hp left!");
                    System.out.println("It scratches your face with it's horns!");
                    int userHealthCalculate = getUserHealth() - deerDamage;
                    System.out.println("You have " + userHealthCalculate + " hp left!");
                    if (monsterHealthCalculate < 0){
                        System.out.println("WOW! You win but you are exhausted...");
                        break;
                    } else if (userHealthCalculate < 0) {
                        System.out.println("YOU ARE DIED... GAME OVER...");
                        break;
                    }
                }
            }
        }
    }
