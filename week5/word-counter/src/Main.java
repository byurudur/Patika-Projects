import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Collecting Input data, converting the input data to uppercase with toUpperCase();
        // Splitting the input according to spaces and creating a String array named phraseList;
        System.out.println("Please enter a phrase: ");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine().toUpperCase();
        String[] phraseList = phrase.split(" ");
        HashMap<String, Integer> phraseMap = new HashMap<>();

        // Roaming phraseList Arraylist with the key word.
        // If phraseMap is already have that word, then putting the word to key, and increasing the value by 1.
        // Else, the value is just 1.
        for (String word : phraseList) {
            if (phraseMap.containsKey(word)) {
                phraseMap.put(word, phraseMap.get(word) + 1);
            } else {
                phraseMap.put(word, 1);
            }
        }

        // Assigning empty word and word counter for next for loop.
        String wordCounted = "";
        int timesCounted = 0;

        // Using entrySet(); method from Map class to achieve the methods getKey() and getValue().
        // Here, entry roams phraseMap HashMap and finds values.
        // If the value is bigger than zero, then the new wordCounted is that word and the times is assigned to first for loop's counter.
        for (Map.Entry<String, Integer> entry : phraseMap.entrySet()) {
            if (entry.getValue() > timesCounted) {
                wordCounted = entry.getKey();
                timesCounted = entry.getValue();
            }

        }

        // Output data.
        System.out.println("The word " + wordCounted + " is in this sentence " + timesCounted + " times.");


    }
}