import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    private String userCharacter;
    private int userHealth;
    private int userDamage;
    private int userMoney;
    private String userWeapon;
    private int userChoice;
    private String userName;

    Characters characters;
    Scanner input = new Scanner(System.in);
    Random rand = new Random();



    public void alInfo(){
        getUserChoice();
        getUserDamage();
        getUserHealth();

    }

    public void dialogSleeper2000() {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bracketEquals() {
        System.out.println("================================");
    }

    public void statsInfo() {
        bracketEquals();
        System.out.println("Character: " + userCharacter);
        dialogSleeper2000();
        System.out.println("Health: " + userHealth);
        dialogSleeper2000();
        System.out.println("Damage: " + userDamage);
        dialogSleeper2000();
        System.out.println("Money: " + userMoney);
        dialogSleeper2000();
        System.out.println("Special Weapon: " + userWeapon);
        bracketEquals();
    }

    public void gameStarter() {

        System.out.println("'You woke up in a coast with no clothes, bleeding. An old man with a long white beard smiles at you; '");
        bracketEquals();
        System.out.println("Welcome stranger. Welcome to this is forgotten continent, so called 'Azure Atoll'.");
        dialogSleeper2000();
        System.out.println("You shall defeat many enemies here in Azure Atoll, win battles for your honor and your life.");
        dialogSleeper2000();
        System.out.println("What do they call you in your lands?:");
        userName = input.nextLine();
        System.out.println("Welcome " + userName + "." + "You have to choose a path for glory or to be forgotten. " +
                "Choose your way and dive in to Azuri..." +
                "Go now. Go live your life.");
        dialogSleeper2000();
        System.out.println("*You are standing up and looking at a mirror. You are a/an:");
        System.out.println( "1 - SAGE, " +
                            "2 - CAVALRY, " +
                            "3 - NAVY, " +
                            "4 - LUCKY");
        Wiseman wiseman = new Wiseman();
        Cavalry cavalry = new Cavalry();
        Navy navy = new Navy();
        Lucky lucky = new Lucky();

        do {
            userChoice = input.nextInt();
            setUserChoice(userChoice);
            alInfo();
            switch (userChoice) {
                case 1:
                    System.out.println("You are a Sage! You may be weak, but you have the strangest power of all.. Wisdom of enemies...");
                    userCharacter = wiseman.getName();
                    userHealth = wiseman.getHealth();
                    userDamage = wiseman.getDamage();
                    userMoney = wiseman.getMoney();
                    userWeapon = wiseman.getWeaponName();
                    statsInfo();
                    break;
                case 2:
                    System.out.println("You are a Cavalry. On the back of your horse you wander slowly, slaughter your enemies.");
                    userCharacter = cavalry.getName();
                    userHealth = cavalry.getHealth();
                    userDamage = cavalry.getDamage();
                    userMoney = cavalry.getMoney();
                    userWeapon = cavalry.getWeaponName();
                    statsInfo();
                    break;
                case 3:
                    System.out.println("You are a navy now. Crazy drunk guy with rum and gun.");
                    userCharacter = navy.getName();
                    userHealth = navy.getHealth();
                    userDamage = navy.getDamage();
                    userMoney = navy.getMoney();
                    userWeapon = navy.getWeaponName();
                    statsInfo();
                    break;
                case 4:
                    System.out.println("You are so lucky that sometimes you can achieve extra items.");
                    userCharacter = lucky.getName();
                    userHealth = lucky.getHealth();
                    userDamage = lucky.getDamage();
                    userMoney = lucky.getMoney();
                    userWeapon = lucky.getWeaponName();
                    statsInfo();
                    break;
                default:
                    System.out.println("You have to choose your fate! " +
                            "Make a choose again, my son of reverend king Adam..:");
                    continue;
            }
            break;
        } while (true);

        System.out.println("Okay, " + userName + ", your story here shall start.");
        dialogSleeper2000();
        System.out.println("The borders are passed and enemies are apart.");
        dialogSleeper2000();
        System.out.println("You as a " + userCharacter + " shall defeat.");
        dialogSleeper2000();
        System.out.println("Choose your wants, give yourself a treat.");
        bracketEquals();
        dialogSleeper2000();

        while (true) {

            System.out.println("Where do you want to go?");
            System.out.println("1 - To adventure! ");
            System.out.println("2 - To the marketplace! ");
            int wayDecision = input.nextInt();
            switch (wayDecision) {
                case 1:
                    System.out.println(getUserChoice());
                    locationInfo();
                    locationDecide();
                    break;
                case 2:
                    marketActions();
                    continue;
                default:
                    System.out.println("You must feel dizzy. Make a choice " + userName + " the " + userCharacter);
            }break;
        }
    }

    public void locationInfo() {
        System.out.println("*You feel ready to expose sunlight.. Old man gave you a map which have locations to go and conquer.");
        bracketEquals();
        dialogSleeper2000();
        System.out.println("*You checking the map... It has... ");
        bracketEquals();
        dialogSleeper2000();
        System.out.println("1 - Forest:");
        System.out.println("High holy trees, milk white fog, misty cricket noises... There is one big enemy and one holy item to get.");
        dialogSleeper2000();
        System.out.println("One healing herb.. It will increase your health by 100... But it has a big protector. The devil of the forest...");
        dialogSleeper2000();
        System.out.println("AND THE PHARAOH SON OF THE UNHOLY ONE, DEVIL THE TWO HEADED DEER protects this herb to until it's death");
        bracketEquals();
        System.out.println("2 - City:");
        System.out.println("Big misty fog of hammersmith fire, noise disgust, public places... This is the Roamone city with it's all ugliness.");
        dialogSleeper2000();
        System.out.println("Everybody desires one thing... The blue sword of the Abbator the Slayer... One big protector though...");
        dialogSleeper2000();
        System.out.println("The hammersmith Roaniec... Fattest of the fats. Loves this sword and never gives it to anybody.");
        System.out.println("The sword gives you +30 additional hit every time... ");
        bracketEquals();
        System.out.println("3 - Desert: ");
        System.out.println("Sands, snakes, tarantulas... Not a single of them is as deadly as the big red sun... And at nights, this desert becomes deadly as an omen.");
        dialogSleeper2000();
        System.out.println("Scorpion the Swords Tail, protects in it's cave the superior of all; Ratherwind treasure; 1000 coin. ");
        bracketEquals();
        System.out.println("4 - Swamp: ");
        System.out.println("Lautherkonog Swamp is a magical place. Why? Because it add something random to your inventory...");
        dialogSleeper2000();
        System.out.println("This swamp has a magical algea, which protected by the hammertooth Crocodile the Crusher...");
        bracketEquals();

    }

    public void locationDecide(){
        System.out.println("Where do you want to travel, " + userName + "?");
        while (true){
            int locationTravel = input.nextInt();
            switch (locationTravel){
                case 1:
                    System.out.println("You have decided to go to the forest...");
                    dialogSleeper2000();
                    System.out.println("You are wandering around tall trees, sun light is almost gone...");
                    dialogSleeper2000();
                    System.out.println("Suddenly you saw the 2 headed deer... LET THE HORNS CRUSH!");
                    break;
                case 2:
                    System.out.println("You have decided to go to the city...");
                    dialogSleeper2000();
                    System.out.println("You are wandering around gettos and everyone looking strange...");
                    dialogSleeper2000();
                    System.out.println("Suddenly you saw the Roaniec... LET THE FIST-FIGHT BEGINS!");
                    // city fight
                    break;
                case 3:
                    System.out.println("You have decided to go to the desert...");
                    dialogSleeper2000();
                    System.out.println("You are wandering under burning sun and polar bears...");
                    dialogSleeper2000();
                    System.out.println("Suddenly you saw the Sword Tail... LET THE SWORDING BEGINS!");
                    break;
                case 4:
                    System.out.println("You have decided to go to the swamp...");
                    dialogSleeper2000();
                    System.out.println("You are wandering around the fog and green swamp stuff and flies.");
                    dialogSleeper2000();
                    System.out.println("Suddenly you saw the Hammer tooth.. LET THE CRUSHING BEGINS!");
                    break;
                default:
                    System.out.println("You have to decide something...");
                    continue;
            }break;
        }
    }

    public void marketLoop(){
        while (true) {

            System.out.println("Where do you want to go?");
            System.out.println("1 - To adventure! ");
            System.out.println("2 - To the marketplace! ");
            int wayDecision = input.nextInt();
            switch (wayDecision) {
                case 1:
                    System.out.println(getUserChoice());
                    locationInfo();
                    locationDecide();
                    break;
                case 2:
                    marketActions();
                    continue;
                default:
                    System.out.println("You must feel dizzy. Make a choice " + userName + " the " + userCharacter);
            }break;
        }
    }




    public void marketActions() {
        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("*A young lady looking at your dirty face*");
            dialogSleeper2000();
            System.out.println("What do you want sir?");
            dialogSleeper2000();
            System.out.println("We have 1- Bread (10 coin), 2 - Meat (70 coin), 3 - Water (50 coin), 4 - Wine (25 coin)");
            dialogSleeper2000();
            System.out.println("*And you chose: ");
            int marketChoice = input.nextInt();
            System.out.println(userHealth);
            switch (marketChoice) {
                case 1:
                    bracketEquals();
                    System.out.println("Here's your bread kind sir.");
                    dialogSleeper2000();
                    System.out.println("Your health will increase by 25");
                    userMoney -= 10;
                    userHealth += 25;
                    System.out.println("Your new health is : " + userHealth);
                    dialogSleeper2000();
                    System.out.println("Your new money amount is: " + userMoney);
                    break;
                case 2:
                    bracketEquals();
                    System.out.println("Here's your meat. I'll never understand the vegetarians...");
                    dialogSleeper2000();
                    System.out.println("Your health will increase by 75");
                    userMoney -= 70;
                    userHealth += 75;
                    System.out.println("Your new health is : " + userHealth);
                    dialogSleeper2000();
                    System.out.println("Your new money amount is: " + userMoney);
                    break;
                case 3:
                    bracketEquals();
                    System.out.println("Here's your water. May the rain splash into your stomach...");
                    dialogSleeper2000();
                    System.out.println("Your health will increase by 50");
                    userMoney -= 50;
                    userHealth += 50;
                    System.out.println("Your new health is : " + userHealth);
                    dialogSleeper2000();
                    System.out.println("Your new money amount is: " + userMoney);
                    break;
                case 4:
                    bracketEquals();
                    System.out.println("Here's your wine. Drink responsibly.");
                    dialogSleeper2000();
                    System.out.println("Your health will decrease by 10");
                    userMoney -= 25;
                    userHealth -= 10;
                    System.out.println("Your new health is : " + userHealth);
                    dialogSleeper2000();
                    System.out.println("Your new money amount is: " + userMoney);
                    break;
                default:
                    bracketEquals();
                    System.out.println("But you have to chose something kind sir...");
                    dialogSleeper2000();
                    System.out.println("OR GET OUT OF MY MARKET! I'M SO TIRED FOR FAKE SMILES YOU PUNK!");
                    continue;
            }
            break;
        }
    }


    public String getUserCharacter() {
        return userCharacter;
    }

    public void setUserCharacter(String userCharacter) {
        this.userCharacter = userCharacter;
    }

    public int getUserHealth() {
        return userHealth;
    }

    public void setUserHealth(int userHealth) {
        this.userHealth = userHealth;
    }

    public int getUserDamage() {
        return userDamage;
    }

    public void setUserDamage(int userDamage) {
        this.userDamage = userDamage;
    }

    public int getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(int userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserWeapon() {
        return userWeapon;
    }

    public void setUserWeapon(String userWeapon) {
        this.userWeapon = userWeapon;
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }
}
