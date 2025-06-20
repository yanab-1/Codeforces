import java.util.Scanner;

public class C_1914{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            int secMax=0;
            int sum=0;
            int ans=0;
            for(int i=0;i<Math.min(k,n);i++){
                sum+=a[i];
                secMax=Math.max(secMax,b[i]);
                ans=Math.max(ans,sum+secMax*(k-i-1));
            }
            System.out.println(ans);
        }
    }
}