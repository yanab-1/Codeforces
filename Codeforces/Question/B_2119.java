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
        long dist=(px-qx)*(px-qx)+(py-qy)*(py-qy);
        long sum=0;
        long max=0;
        for(int i=0; i<n; i++){
            x[i] = sc.nextLong();
            sum += x[i];
            if(x[i] > max) {
                max = x[i];
            }
        }
        if(sum*sum<dist){
            System.out.println("no");
            return;
        }
        long min=Math.max(0,2*max-sum);
        if(min*min>dist){
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }
}
