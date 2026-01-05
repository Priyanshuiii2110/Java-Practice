

public class factorial {
 public int  isFactorial(int n){
 int i =1;
    int factorial= 1;
    while( i<=n){
        factorial *=i;
        i++;

    }
    return factorial;
 }   
 public static void main(String[] args) {
    factorial factorial = new factorial();
    
    System.out.println("Factorial is :" +factorial.isFactorial(5));
 }
}
