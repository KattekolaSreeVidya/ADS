import java.io.*;
public class Arraysss{
    static boolean checkPair(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        //edit
        int x=99;
        if (checkPair(arr,x)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
