
public class abstraction {

    public static void main(String[] args) {
        // horse h = new horse();
        // h.eat();
        // h.name();

        // Constructor hierarchy 
        
        Mustang m = new Mustang();

    }

}
 
abstract class Animal {
  abstract void eat();   // just an idea not to implement..
    void name(){
        System.out.println("Animal");
    }
     Animal(){
        System.out.println("Animal");
    }
}
 
class horse extends Animal{
    void eat(){
       System.out.println("Horse eats");
    }
     horse(){
        System.out.println("Horse");
    }
}

 
 class Mustang extends horse {
 
     Mustang(){
        System.out.println("mustang");
    }
 }