
import java.util.Scanner;

public class F_1669 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            print(a,n);
        }
    }

    private static void print(int[] a, int n) {
        int l=0;
        int r=n-1;
        int ans=0;
        int bob=a[r];
        int alice=a[0];
        while(l<r){
            if(bob==alice){
                ans=Math.max(l+1+n-r,ans);
                l++;
                r--;
                alice+=a[l];
                bob+=a[r];
            }
            else if(bob>alice){
                l++;
                alice+=a[l];
            }
            else{
                r--;
                bob+=a[r];
            }
        }
        System.out.println(ans);
    }
}