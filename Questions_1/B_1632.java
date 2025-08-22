
import java.util.Scanner;

public class B_1632 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=1;
            while(2*k<=n-1){
                k*=2;
            }
            for(int i=k-1;i>=0;i--){
                System.out.print(i+" ");
            }
            for(int i=k;i<n;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
