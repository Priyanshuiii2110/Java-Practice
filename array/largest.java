
public class largest {
public static int  largestElement() {
     int[] arr = {2,5,8,5,9};
     int lar = arr[0];
// for (int i = 0; i < arr.length; i++) {
for (int i : arr) {
    if(i>lar){
        lar=i;
    }
}
return lar;
}
public static void main(String[] args) {
   System.out.println("The Largest Element is "+ largestElement());


}
}
