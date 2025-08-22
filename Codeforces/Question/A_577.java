
import java.util.Scanner;

public class A_577 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(x%i==0 && x/i<=n){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
