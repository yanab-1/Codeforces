
import java.util.Scanner;

public class A_2056 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] xy=new int[n][2];
            for(int i=0;i<n;i++){
                xy[i][0]=sc.nextInt();
                xy[i][1]=sc.nextInt();
            }
            int ans=2*m;
            for(int i=1;i<n;i++){
                ans+=(xy[i][0] + xy[i][1]);
            }
            System.out.println(ans*2);
        }
    }
}
