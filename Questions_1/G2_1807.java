import java.util.Arrays;
import java.util.Scanner;

public class G2_1807 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(a[0]!=1){
            System.out.println("no");
            return;
        }
        long sum=1;
        for(int i=1;i<n;i++){
            if(a[i]>sum){
                System.out.println("no");
                return;
            }
            sum+=a[i];
        }
        System.out.println("yes");
    }
}
