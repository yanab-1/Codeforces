import java.util.Arrays;
import java.util.Scanner;

public class A_471 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]==arr[3]){
            System.out.println(arr[4]==arr[5]?"Elephant":"Bear");
        }
        else if(arr[1]==arr[4]){
            System.out.println("Bear");
        }
        else if(arr[2]==arr[5]){
            System.out.println(arr[0]==arr[1]?"Elephant":"Bear");
        }
        else{
            System.out.println("Alien");
        }
    }
}
