import java.util.Scanner;

public class C_959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(n < 6){
            System.out.println(-1);
        }
        else{
            System.out.println(1 + " " + 2);
            System.out.println(1 + " " + 3);
            System.out.println(1 + " " + 4);
            for(int i = 5; i <= n; i++){
                System.out.println(2 + " " + i);
            }
        }
        for(int i = 1; i < n; i++){
            System.out.println(i + " " + (i + 1));
        }

    }
}
