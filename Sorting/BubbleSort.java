package Java.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int arr[] = {2,3,1,5,4,7,6};
      bubble(arr);  
System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        // in case the array is already sorted so thye no of passes wiil be 0
boolean sorted ;

     // no of passes is denoted by i 
     for (int i = 0; i < arr.length; i++) {
sorted = false;
        //j is the consecutive comparision ,mx item come at at at respective loop/pass
  for (int j = 1; j < arr.length-i; j++) {

         // swap if item is smaller then previous one
    if ( arr[j] < arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
       arr[j-1] = temp;
      // swapped = true;
    }
}
if (!sorted == true) {
    break;
     }

}
    }
}
