import java.util.Scanner;

public class B_2119 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
	private static void solve(Scanner sc) {
        long n=sc.nextLong();
        long px=sc.nextLong();
        long py=sc.nextLong();
        long qx=sc.nextLong();
        long qy=sc.nextLong();
        long[] x = new long[(int)n];
        long sum=0;
        long max=0;
        for(int i=0; i<n; i++){
            x[i] = sc.nextLong();
            sum += x[i];
            if(x[i] > max) {
                max = x[i];
            }
        }
        double EPS = 1e-9;
        double dx=qx-px;
        double dy=qy-py;
        double d=Math.hypot(dx, dy);
        long res=sum-max;
        double l=(max>res) ? (max-res) : 0.0;
        if(d+EPS>=l && d<=sum+EPS){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
