
import java.util.Scanner;

public class C_1878 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();
            long min=k*(k+1);
            long max=n*(n+1)-(n-k)*(n-k+1);
            if(2*x>=min && 2*x<=max){
                System.out.println("YES");
            }else{
                System.out.println("no");
            }
        }
    }
}
