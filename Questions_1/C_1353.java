
import java.util.Scanner;

public class C_1353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            if(n==1){
                System.out.println(0);
                continue;
            }
            long c=8;
            int j=1;
            for(int i=1;i<n;i+=2){
                sum+=(c*j);
                c+=8;
                j++;
            }
            System.out.println(sum);
        }
    }
}
