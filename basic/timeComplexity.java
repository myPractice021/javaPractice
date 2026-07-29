import java.util.Scanner;

public class timeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Uses O(n) space.
        int[] arr = new int[n];

        // Uses O(n^2) space.
        int[][] matrix = new int [n][n];

        // Time Complexity = O(n)
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Time Complexity = O(n^2) 
        for(int i = 0; i < n; i++) {
            for(int j=0;j<n; j++){

                System.out.print(arr[i] + " ");
            }
        }
                                                                                    
     sc.close();
    }
}

