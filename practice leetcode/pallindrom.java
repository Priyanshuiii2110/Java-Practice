/* 
public class pallindrom {

    public boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
       pallindrom sol = new pallindrom(); // create an object
        int number = 555;
        if (sol.isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}*/

// ALTERNATE METHOD

public class pallindrom {
    public static void main(String[] args) {
      String start = "abcdcba";
if(isPallindom(start)== true){
    System.out.println("Pallindrom number");
}
else{
       System.out.println("Not a Pallindrom number");
}
            }
         static boolean isPallindom (String start){
             start = start.toLowerCase();
            int  len = start.length();
            for (int i=0 ;i<len/2;i++){
              if(start.charAt(i) !=start.charAt(len -i-1) ){
                return false;
              }
            }
              return true;
            
         }
    
}