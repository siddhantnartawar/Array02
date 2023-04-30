import java.io.*;

public class ReturnIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
         
            System.out.println("Enter Element to Search:");
            int search = Integer.parseInt(br.readLine());
            for(int i=0;i< arr.length; i++){

            if (arr[i] == search){
                System.out.println("Index of Element is " + i);
            }
        }

        }
}
