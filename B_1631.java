import java.util.Scanner;

public class B_1631 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=n-2;
        while(i>=0 && a[i]==a[n-1]){
            i--;
        }
        if(i<0){
            System.out.println(0);
            return;
        }
        int ans=0;
        while(i>=0){
            i-=(n-1-i);
            ans++;
            while(i>=0 && a[i]==a[n-1]){
                i--;
            }
        }
        System.out.println(ans);
    }
}
