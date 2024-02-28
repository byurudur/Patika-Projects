public class Main {
    public static void main(String[] args) {
        int[] myList  ={2, 7, 5, 3, 4, 6, 2, 3, 4, 5, 1, 7, 6, 1, 4, 5, 3, 7, 6, 2};

        System.out.println("Duplicating even numbers are: ");


        for (int i = 0; i < myList.length ; i++){
            for (int j = i + 1; j < myList.length; j++){
                if ((i % 2 == 0) && (j % 2 == 0) && (myList[i] == myList[j])){
                    System.out.println(myList[i]);
                    break;
                }

            }
        }

    }
}