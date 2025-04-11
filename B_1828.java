import java.util.Scanner;

public class B_1828 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int res=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                res=gcd(res,Math.abs(a[i]-i-1));
            }
            System.out.println(res);
        }
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
