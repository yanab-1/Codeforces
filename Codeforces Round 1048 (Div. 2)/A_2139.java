import java.util.Scanner;

public class A_2139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println(0);
            return;
        }
        if(a % b == 0 || b % a == 0){
            System.out.println(1);
            return;
        }
        System.out.println(2);
    }
}
