import java.util.Scanner;

public class B_2109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            if((n+1-a)<a) a=n+1-a;
            if((m+1-b)<b) b=m+1-b;
            System.out.println(Math.min(1+ans(n)+ans(b), 1+ans(m)+ans(a)));
        }
    }
    static long ans(long x){
        long res=0;
        while(x>1){
            res++;
            x=(x+1)/2;
        }
        return res;
    }
}
