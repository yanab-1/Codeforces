import java.util.Scanner;

public class A_1277 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int ans=0;
        int b=0;
        for(int i=1;i<=9;i++){
            b=b*10+1;
            for(int j=1;j<=9;j++){
                if(b*j<=n){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
