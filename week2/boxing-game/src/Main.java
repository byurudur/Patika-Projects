import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Game fighter = new Game("Halil Umut Meler", 100, "AG Başkanı", 100);

        if (fighter.weight1 != fighter.weight2){
            System.out.println("The weights of the fighters must be equal.");
        }else {
            System.out.println("Game on!");
        }

        fighter.opening();
        fighter.gaming();


    }
}