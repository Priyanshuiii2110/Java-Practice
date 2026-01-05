package Java.Basic;
public class pattern {
    public static void main(String[] args) {
       /*  for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
    }*/
    //pat();
    numberPattern(4);
}
 /*public static void pat(){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=(5-i+1);j++){
            System.out.print("*");
    }
    System.out.println();
}
}*/
public static void numberPattern(int num){
    int n=1;
    for(int i=1;i<num;i++){
        for(int j=1;j<=(i);j++){
            System.out.print(n);
            n++;
    }
    System.out.println(" ");
}
}


















}
