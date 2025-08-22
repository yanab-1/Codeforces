import java.util.Scanner;

public class B_1682 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            print(arr, n);
        }
    }

    private static void print(int[] arr, int n) {
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]!=i){
                ans&=arr[i];
            }
        }
        System.out.println(ans);
    }
}
