
import java.util.Scanner;

public class C_2123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {    
                arr[i] = sc.nextInt();
            }
            print(arr, n);
        }
    }

    private static void print(int[] arr, int n) {
        int[] ans=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                ans[i]=1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                ans[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}
