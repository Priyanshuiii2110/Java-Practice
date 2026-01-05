package Java.Basic;

public class prime {
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
