
import java.util.Scanner;

public class A_1327 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(k*k<=n && k%2==n%2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
