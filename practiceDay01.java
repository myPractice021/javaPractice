// Time Complexity O(n)
// import java.util.*;

public class practiceDay01 {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 18, 5};

        System.out.println("Print all elements of an array.");
        
        for(int i = 0; i< arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Find the largest element.");
        
        int largeEle= arr[0];
        int smallEle= arr[0];

        for ( int num : arr){
            if(largeEle< num)
                largeEle= num;
            if(smallEle> num)
                smallEle= num;
        }
        System.out.println (largeEle);

        System.out.println("Find the smallest element.");

        System.out.println (smallEle);

        int sum=0;

        for (int num :arr){
            sum=sum+num;
        }
        System.out.println ("sum of all Elements of array is");

        System.out.println (sum);

        System.out.println ((sum/arr.length) );
    }
}