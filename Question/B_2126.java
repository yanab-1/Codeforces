import java.util.Scanner;

public class B_2126 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c++;
            }
            else if(a[i]==1){
                c=0;
            }
            if(c==k){
                ans++;
                c=0;
                i++;
            }
        }
        System.out.println(ans);
    }
}
