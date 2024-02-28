/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a matrix in dimension of 3x3: ");
        int[][] userMatrix = new int[3][3];
        int[][] codeMatrix = new int[3][3];

        userMatrix[0][0] = input.nextInt();
        userMatrix[0][1] = input.nextInt();
        userMatrix[0][2] = input.nextInt();
        userMatrix[1][0] = input.nextInt();
        userMatrix[1][1] = input.nextInt();
        userMatrix[1][2] = input.nextInt();
        userMatrix[2][0] = input.nextInt();
        userMatrix[2][1] = input.nextInt();
        userMatrix[2][2] = input.nextInt();
        System.out.println("Your matrix transposed: ");

        for (int i = 0; i < userMatrix.length; i++){
            for (int j = 0; j < userMatrix[i].length; j++){
                System.out.print(userMatrix[j][i] + " ");
            }
            System.out.println();

        }

    /*

     Due to clean-coding this part has been commented, can be seen in the initial version of the codes from Github.

     codeMatrix[0][0] = userMatrix[0][0];
     codeMatrix[0][1] = userMatrix[1][0];
     codeMatrix[0][2] = userMatrix[2][0];
     codeMatrix[1][0] = userMatrix[0][1];
     codeMatrix[1][1] = userMatrix[1][1];
     codeMatrix[1][2] = userMatrix[2][1];
     codeMatrix[2][0] = userMatrix[0][2];
     codeMatrix[2][1] = userMatrix[1][2];
     codeMatrix[2][2] = userMatrix[2][2];

     System.out.println("Your matrix transposed: ");

     for (int i = 0; i < codeMatrix.length; i++)
     {
     for (int j = 0; j < codeMatrix[i].length; j++)
     {
     System.out.print(codeMatrix[i][j]+ " ");
     }
     System.out.println();
     }

    */


    }
}