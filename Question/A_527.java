import java.util.Scanner;

public class A_527 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        long a=sc.nextLong();
        long b=sc.nextLong();
        long ans=0;
        while(b!=0){
            ans+=a/b;
            long t=a%b;
            a=b;
            b=t;
        }
        System.out.println(ans);
    }
}
