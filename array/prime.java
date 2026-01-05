
public class prime {
   public static void main(String[] args) {
    int num = 23;
if(Isprime(num)){
    System.out.println("Prime");
}
else{
    System.out.println("NotPrime");
}

   } 
   public static boolean Isprime(int num) {
    if(num == 0 ) return false;
     if(num == 1 ) return false;
     for (int i = 2; i<num-1 ;i++){
         if(num % i ==0 ) return false;
     }
        return true;
     }
   }

