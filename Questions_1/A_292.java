import java.util.Scanner;

public class A_292 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        long t=0;
        long q=0;
        long max=0;
        for(int i=0;i<n;i++){
            if(t<a[i][0]){
                long idle=a[i][0]-t;
                q-=Math.min(idle,q);
                t+=Math.min(idle,q);
                if(t<a[i][0]){
                    t=a[i][0];
                }
            }
            q+=a[i][1];
            max=Math.max(max,q);
        }
        t+=q;
        System.out.println(t+" "+max);
    }
}
