
import java.util.Scanner;

public class A_1856 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=0;
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]){
                    ans=Math.max(arr[i-1],ans);
                }
            }
            System.out.println(ans);
        }
    }
}
