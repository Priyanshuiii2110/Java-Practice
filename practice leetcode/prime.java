/* 
public class prime {
    public static int Prime(int n){
        
for(int i=2;i<n-1;i++){
if(n%2!=0){
   return 1;
}

}
return 0;
    }
    public static void main(String[] args) {
        if (Prime(87)== 1){
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}
*/


// PRIME NO B/W A RANGE
public class prime {
    public static int Prime(int n1 ,int n2 ){
         
for(int i=2;i<n2-1;i++){
if(n1%2!=0){
    n1++;
   return 1;
}
}
return 0;
    }
    public static void main(String[] args) {
     int result = Prime(1 ,50 );
      if (  Prime(1 ,50 )== 1)
System.out.println(result);
    }
}