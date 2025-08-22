
import java.util.Scanner;

public class C_2091 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2==0){
                System.out.println(-1);
                continue;
            }
            else{
                int[] ans=new int[n];
                for(int i=1;i<=n;i++){
                    int val=(2*i-1)%n;
                    if(val==0){
                        val=n;
                    }
                    ans[i-1]=val;
                }
                for(int i=0;i<n;i++){
                    System.out.print(ans[i]+(i<n-1 ? " ":""));
                }
            }
            System.out.println();
        }
    }
}
