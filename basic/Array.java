import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Uses O(n) space.
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[2]);

        arr[2]= 100;

        System.out.println(arr.length);
        
        
     sc.close();
    }
}

