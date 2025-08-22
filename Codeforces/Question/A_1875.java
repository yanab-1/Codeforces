
import java.util.Scanner;

public class A_1875 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long ans=b-1;
            b=1;
            for(int i=0;i<n;i++){
                ans+=(Math.min(a,b+arr[i])-1);
            }
            System.out.println(ans+1);
        }
    }
}
