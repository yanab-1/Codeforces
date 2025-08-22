import java.util.Arrays;
import java.util.Scanner;

public class B_2091 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int ans=0;
            int c=0;
            for(int i=n-1;i>=0;i--){
                c++;
                if((long) a[i]*c>=x){
                    ans++;
                    c=0;
                }
            }
            System.out.println(ans);
        }
    }
}
