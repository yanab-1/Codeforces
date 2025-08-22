
import java.util.Scanner;

public class A_379 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=0;
        int rem=0;
        while(n!=0){
            ans+=n;
            n+=rem;
            rem=n%m;
            n=n/m; 
        }
        System.out.println(ans);
    }
}
