import java.util.Scanner;
public class array{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[4];
    System.out.println("enter elements");
    for(int i=0; i<4;i++){
        arr[i]=sc.nextInt();
    }
    for(int i:arr){
        System.out.println("The elements are:");
        System.out.println(i);
    }
    System.out.println(arr);
    }
}