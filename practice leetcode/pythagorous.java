
public class pythagorous {
    public boolean isPythagorous(int a,int b, int c){
        double first = a;
         double second = b;
          double third = c;
          first = Math.pow(a,2);
           second = Math.pow(b,2);
            third = Math.pow(c,2);
          if(first + second == third){
            return true;
          }
          return false;
    }
    public static void main(String[] args) {
       pythagorous p = new pythagorous();
        if (p.isPythagorous(3,4,5)== true) {
            System.out.println("PYTHAGOROUS TRIPLET");
        }
        else{
            System.out.println(" NOT A PYTHAGOROUS TRIPLET");
        }
    }
}
