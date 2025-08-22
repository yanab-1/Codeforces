import java.util.Scanner;

public class C_2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n==6){
            System.out.println("1 1 2 3 1 2");
            return;
        }
        for(int i=1;i<=n-2;i++){
            System.out.print(i + " ");
        }
        System.out.println("1 2");
    }
}
