

public class reverse {
    public static void main(String[] args) {
        reverseArray();
    }
    public static void reverseArray() {
        int[] arr= {23,45,65,76,43,22};
        for (int i = arr.length-1; i >= 0; i--) {
           System.out.println(arr[i]);
        }
    }
}
