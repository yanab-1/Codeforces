
import java.util.Scanner;

public class D_2117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            print(a,n);
        }
    }

    private static void print(long[] a,int n) {
        if((2*a[0]-a[1])<0 || (2*a[0]-a[1])%(n+1)!=0){
            System.out.println("no");
            return;
        }
        long x2=(2*a[0]-a[1])/(n+1);
        long x1=a[0]-n*x2;
        if(x1<0){
            System.out.println("no");
            return;
        }
        for(int i=1;i<=n;i++){
            if(a[i-1]-i*x1-(n-i+1)*x2!=0){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
