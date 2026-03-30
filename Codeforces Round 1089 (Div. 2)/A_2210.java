import java.util.Scanner;

public class A_2210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print((n - i) + " ");
        }
        System.out.println();
    }

}
