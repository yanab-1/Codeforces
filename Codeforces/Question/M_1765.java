
import java.util.Scanner;

public class M_1765 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=1;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    a=n/i;
                    break;
                }
            }
            System.out.println(a+" "+(n-a));
        }
    }
}
