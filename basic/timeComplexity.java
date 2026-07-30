import java.util.Scanner;

public class timeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Uses O(n) space.
        int[] arr = new int[n];
        
        String[] arr1 = {"O(1)", "O(log n)", "O(n)", "O(n log n)", "O(n²)", "O(n³)", "O(2^n)", "O(n!)"};

        // Uses O(n^2) space.
        int[][] matrix = new int [n][n];

        // Time Complexity = O(n)
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Time Complexity = O(n^2) 
        for(int i = 0; i < n; i++) {
            for(int j = 0;j < n; j++){
                System.out.print(arr[i] + "");
            }
            System.out.println("");
        }

        // Complexity Order
        System.out.println("Complexity Order ");
        for (String complexity : arr1) {
            System.out.println(complexity);
        }                                                               
     sc.close();
    }
}

