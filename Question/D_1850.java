
import java.util.Arrays;
import java.util.Scanner;

public class D_1850 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int ans=1;
            int c=1;
            for(int i=1;i<n;i++){
                if(a[i]-a[i-1]<=k){
                    c++;
                }
                else{
                    c=1;
                }
                ans=Math.max(ans, c);
            }
            System.out.println(n-ans);
        }
    }
}
