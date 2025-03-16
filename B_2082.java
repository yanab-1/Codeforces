
import java.util.Scanner;

public class B_2082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long n=sc.nextLong();
            long m=sc.nextLong();
            n=Math.min(n, 50);
            m=Math.min(m, 50);
            long min=findmin(x,n,m);
            long max=findmax(x,n,m);
            System.out.println(min+" "+max);    
        }
    }
    public static long findmax(long x,long n,long m){
        while((n+m)>0 && x>1){
            if(n>0){
                x/=2;
                n--;
            }
            else{
                x=(x+1)/2;
                m--;
            }
        }
        if(x==1 && n>0){
            return 0;
        }
        return x;
    }
    public static long findmin(long  x,long  n,long m){
        while((n+m)>0 && x>1){
            if(m>0){
                x=(x+1)/2;
                m--;
            }
            else{
                x/=2;
                n--;
            }
        }
        if(x==1 && n>0){
            return 0;
        }
        return x;
    }
}
