// Time Complexity O(n)

public class ReversePrinting {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 8, 5};
        
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}