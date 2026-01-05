package Constructor;


public class testInterface{
  public static void main(String[] args){
bear b = new bear();
b.eat();
 }
}



interface herbivores {
void eat();
    
}

 interface carnivores {
void eat();
  
}
class bear implements herbivores, carnivores{
    public void eat(){
        System.out.println("Bear eats both herbs and carbs");
    }
}