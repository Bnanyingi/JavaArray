import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class array{
    private static void check(int[] arr, int toCheckValue){
        boolean test = IntStream.of(arr).anyMatch(x -> x == toCheckValue);
        if (test == true){
            System.out.println(toCheckValue+"is found at index "+findIndex(arr, toCheckValue));
        }else{
            System.out.println(toCheckValue+" is not present in the array"+findIndex(arr, toCheckValue) );
        }
    }
    public static int findIndex(int arr[], int toCheckValue){
          if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int i = 0; 
        while (i < len) { 
            if (arr[i] == toCheckValue) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
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
    System.out.println("index : ");
    int toCheckValue = sc.nextInt();
    System.out.println("Array:" + Arrays.toString(arr));
    check(arr, toCheckValue);
    }
}