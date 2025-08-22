
import java.util.Scanner;

public class A_579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            if( n%2==1){
                ans++;
            }
            n/=2;
        }
        System.out.println(ans);
    }
}
