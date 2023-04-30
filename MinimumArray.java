import java.util.*;

public class MinimumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in Array is " + min);

    }

}
