

public class sum {
   public  void Sum(){
    int num = 100;
    int sum =0;
        for(int i=1;i<=num;i++){

       sum += i;
        }
        System.out.println(sum);

   }
   public static void main(String[] args) {
    sum s = new sum();
    s.Sum();
   }
  
}
