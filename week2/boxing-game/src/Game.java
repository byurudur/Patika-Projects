import java.util.Random;

public class Game {

    Random rand = new Random();
    String name1;
    String name2;
    int weight1;
    int weight2;
    int health1 = rand.nextInt(101)+100;
    int health2 = rand.nextInt(101)+100;
    int damage;
    int dodge;
    int coinFlip;


    Game(String name1, int weight1, String name2, int weight2){
        this.name1 = name1;
        this.name2 = name2;
        this.weight1 = weight1;
        this.weight2 = weight2;
    }

    public void tryCatch(){
        try {
            Thread.sleep(1250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void opening() {
        System.out.println("Welcome ladies & Gentleman...");
        tryCatch();
        System.out.println("Our fighters are ready!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("NOW, let the coin toss decide...");
        coinFlip = rand.nextInt(1,3);
        switch (coinFlip){
            case 1:
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The coin has spoken! ");

                System.out.println(name1 + " will throw the first punch! " );
                tryCatch();
                System.out.println("What an amazing punch from " + name1);

                break;
            case 2:
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The coin has spoken! ");
                tryCatch();
                System.out.println(name2 + " will throw the first punch! " );
                tryCatch();
                System.out.println("What an amazing punch from " + name2);

                break;
        }
    }
        public void gaming(){
            while(true){
                if(coinFlip == 1){

                    tryCatch();
                    damage = rand.nextInt(1,11);
                    dodge = rand.nextInt(1,11);
                    health2 = health2 - ( damage + dodge);
                    System.out.println(name2 + " has " + health2 + "HP left! WOW!" +
                            name2 + " dodged " + dodge + " HP! Incredible!");
                    tryCatch();

                    health1 = health1 - ( damage + dodge);

                    System.out.println(name1 + " has " + health1 + "HP left! DAMN! " +
                            name1 + " dodged " + dodge + " HP! Incredible!");
                    tryCatch();
                    if (health1 <= 0 || health2 <= 0){
                        if (health1 > health2){
                            System.out.println("Champion: " + name1);
                            break;
                        }else if (health2 > health1){
                            System.out.println("Champion: " + name2);
                            break;
                        }else {

                            System.out.println("It is a tie......");
                            break;
                        }
                    }
                }else {
                    tryCatch();
                    damage = rand.nextInt(1,11);
                    dodge = rand.nextInt(1,11);
                    health1 = health1 - ( damage + dodge);
                    System.out.println(name1 + " has " + health1 + "HP left! WOW! " +
                            name1 + " dodged " + dodge + " HP! Incredible!");
                    tryCatch();
                    health2 = health2 - ( damage + dodge);

                    System.out.println(name2 + " has " + health2 + "HP left! DAMN!" +
                            name2 + " dodged " + dodge + " HP! Incredible!");
                    if (health1 <= 0 || health2 <= 0){
                        if (health1 > health2){
                            System.out.println("Champion: " + name1);
                            break;
                        }else if (health2 > health1){
                            System.out.println("Champion: " + name2);
                            break;
                        }else {

                            System.out.println("It is a tie......");
                            break;
                        }
                    }
                }
            }
        }
    }