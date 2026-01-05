import java.util.Arrays;

public class sndLagest {
  public static void main(String[] args) {
     int[] arr= {23,45,65,76,43,22};
          Arrays.sort(arr);
          System.out.println("The 2nd Largest element is :"+ arr[arr.length-2]);
  }  
}

