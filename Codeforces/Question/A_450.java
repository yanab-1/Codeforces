
import java.util.Scanner;

public class A_450 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=n;
        int cy=1;
        for(int i=0;i<n;i++){
            int c=(a[i]+m-1)/m;
            if(c>=cy){
                ans=i+1;
                cy=c;
            }
        }
        System.out.println(ans);
    }
}
