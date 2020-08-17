import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class array{
    private static void check(int[] arr, int toCheckValue){
        boolean test = IntStream.of(arr).anyMatch(x -> x == toCheckValue);
        System.out.println("Is"+ toCheckValue + "present in the array: " +test);
    }
    public static void main(String[] args) {
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
    System.out.println("User Num:");
    int toCheckValue = sc.nextInt();
    System.out.println("Array:" + Arrays.toString(arr));
    check(arr, toCheckValue);
    }
}