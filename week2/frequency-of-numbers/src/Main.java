public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,3,3,4,4,4,5,6,6,6,6};


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == -1)
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }

            if (count > 0) {
                System.out.println(arr[i] + " appeared " + count + " times.");
            }
        }
    }
}