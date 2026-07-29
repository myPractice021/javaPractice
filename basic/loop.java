public class loop {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 8, 5};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Using enhanced for loop
        for(int num : arr) {
            System.out.println(num);
        }

    }
}