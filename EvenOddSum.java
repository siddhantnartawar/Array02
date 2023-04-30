import java.io.*;

public class EvenOddSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");
        int Osum = 0, Esum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] % 2 == 0) {
                Esum = arr[i] + Esum;
            } else {
                Osum = arr[i] + Osum;
            }
            System.out.println("Even Numbers Sum is :" + Esum);
            System.out.println("Odd Numbers sum is :" + Osum);
        }
    }
}
