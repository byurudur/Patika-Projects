public class Main {
    public static void main(String[] args) {
        int[] myList = {1, 2, 4, 6, 8, 10, 12, 14, 16, 27};

        double harmonicSum = 1, harmonicAverage; // Harmonic Sum = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
        int listLength = myList.length;

        // For loop will roam all elements in myList until the last element, put the element to the Harmonic Sum formula;
        for (int iterator = 1; iterator <= listLength; iterator++) {

            harmonicSum += harmonicSum + (1/iterator);

        }
        // Harmonic average = Number of elements / Harmonic sum;
        harmonicAverage = (listLength / harmonicSum);
        System.out.println("Harmonic Average is: " + harmonicAverage);

    }
}