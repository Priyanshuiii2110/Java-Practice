
public class polymorphism {
  public static void main(String[] args) {
    // Calculator c = new Calculator();
    //     System.out.println(c.sum((float)1.314, (float)5.014));
    //     System.out.println(c.sum(1, 5));

    cal c = new cal();
        System.out.println(c.sum(5.3,3.2));
    
  } 

}
  //   ->>>  Method Overloading 

class Calculator {
 int sum(int a ,int b){
    return a+b;
 }
 float sum(float a ,float b){
    return a+b;
 }
 double sum (double a , double b){
        return a-b;
    
}}
    //   ->>>  Method Overriding
   class cal extends Calculator {
    double sum (double a , double b){
        return a-b;
    }
        
    }