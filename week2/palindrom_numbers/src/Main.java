/**
 * @author Ahmet Batuhan Yürüdür
 * @since 2024
 */
public class Main {

    static boolean isPalindrom(int number){
        int temp = number, lastDigit, reverseNumber = 0 ;
        while(temp != 0 ){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(15551)); // Inputs can be entered on parenthesis

    }
}
