package Inheritance;
                // ******* HYBRID INHERITANCE *******  
                
                
public class inheritance {
    public static void main(String[] args) {
        Bird obj = new Bird();
           obj.sleep();
    }
}

//  BASE CLASS

class Animal{
    String breed ; 

    void sleep(){
      System.out.println("Sleep");

    }
}

// DERIVED CLASS
class Mammal extends Animal {
    void walk(){
        System.out.println(" Walk");
    }
}
class Dog extends Mammal {
    void Doggy(){
        System.out.println(" Dog");
    }
}

class Fish extends Animal {
    String name;
    void swim(){
        System.out.println(" swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println(" fly");
    }
}
class Parrot extends Bird {
    void Sound(){
        System.out.println(" Sound");
    }
}


/*
                // ******* HIERACHIAL INHERITANCE ******* 

public class inheritance {
    public static void main(String[] args) {
        Fish obj = new Fish();
          obj.name ="Tuna";
          System.out.println(obj.name);
           obj.sleep();
    }
}

//  BASE CLASS

class Animal{
    String breed ; 

    void sleep(){
      System.out.println("Sleep");

    }
}

// DERIVED CLASS
class Mammal extends Animal {
    void walk(){
        System.out.println(" Walk");
    }
}

class Fish extends Animal {
    String name;
    void swim(){
        System.out.println(" swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println(" fly");
    }
}
 */