import java.util.Scanner;

public class B_620 {
    static int[] c={6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }
    public static void solve(Scanner sc) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=0;
        for(int i=a;i<=b;i++){
            int x=i;
            while(x>0){
                ans+=c[x%10];
                x/=10;
            }
        }
        System.out.println(ans);
    }
}
