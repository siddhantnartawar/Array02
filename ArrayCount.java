import java.io.*;

class ArrayCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Size");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");
        int Ocount = 0, Ecount = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] % 2 == 0) {
                Ecount++;
            } else {
                Ocount++;
            }
            System.out.println("Even Count is :" + Ecount);
            System.out.println("Odd Count is :" + Ocount);
        }
    }
}
