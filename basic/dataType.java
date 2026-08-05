import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // integer
        int a = 80;

        // boolean 
        boolean b = true;
        
        // character

        char c = '9';

        // Arrays in Java

        // Declaration
        int[] arr;

        // Initialization
        arr = new int[5];

        // Or both together
        int[] arr1 = new int[5];

        int n = sc.nextInt();
        
        // array 
        int[] arr2 = new int[n];

        int[] arr3 = new int[5];


                            
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }         

        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
                                                                                    
     sc.close();
    }
}

