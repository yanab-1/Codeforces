
import java.util.Scanner;

public class C_2093 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            int k=sc.nextInt();
            if(k==1){
                if(isPrime(x)){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            else{
                if(x==1 && k==2){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            
        }
    }
    public static  boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
