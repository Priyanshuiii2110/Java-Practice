package Java.Basic;
public class LinearSearc{
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
           if(key==arr[i]){
            return i;
           }    
        
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={23,48,65,32,45};
         int key=55;
        int index= LinearSearch(arr,key);
        if(index == -1){
            System.out.println("KEY NOT FOUNND");
        }
        else{
            System.out.println("KEY FOUND AT INDEX " + index);
        }
    }
    }
