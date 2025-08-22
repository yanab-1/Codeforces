
import java.util.Scanner;

public class C_2074 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(power(x) || power(x+1)){
                System.out.println(-1);
            }
            else{
                int m=31-Integer.numberOfLeadingZeros(x);
                int y=(1<<m)-1;
                System.out.println(y);
            }
        }
    }
    public static boolean power(int n){
        return (n&(n-1))==0;
    }
}
