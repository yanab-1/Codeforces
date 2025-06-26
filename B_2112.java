
import java.util.Scanner;

public class B_2112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            print(arr,n);
        }
    }

    private static void print(int[] arr,int n) {
        if(arr.length==1){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i] - arr[i+1])<=1 ){
                System.out.println(0);
                return;
            }
        }
        for(int i=1;i<arr.length-1;i++){
            if((arr[i]>arr[i-1] && arr[i]>arr[i+1]) || (arr[i]<arr[i-1] && arr[i]<arr[i+1])){
                System.out.println(1);
                return;
            }
        }
        System.out.println(-1);
    }
}
