import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/numbers.txt"))) {
            String line;
            int total = 0;
            while ((line = bufferedReader.readLine()) != null){
                int lineInt = Integer.parseInt(line);
                total = total + lineInt;
                System.out.println("Numbers from numbers.txt: " + lineInt);
            }
            System.out.println("Their sum: " + total);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");;
        } catch (IOException e) {
            System.out.println("Opening file has created an error: " + e);;
        }
    }
}