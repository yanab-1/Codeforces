import java.util.Scanner;

public class C_2209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        if(ask(1, 2, sc) == 1 || ask(1, 3, sc) == 1){
            answer(1);
            return;
        }
        if(ask(2, 3, sc) == 1 ) {
            answer(2);
            return;
        }
        if(n == 2){
            answer(2 * n);
            return;
        }
        int count = 3;
        for(int i = 4; i <= 2 * n - 1 && count < n + 1; i+=2){
            if(ask(i, i + 1, sc) == 1){
                answer(i);
                return;
            }
            count++;
        }
        answer(2 * n);
        return;
    }

    private static int ask(int i, int j, Scanner sc) {
        System.out.println("? " + i + " " + j);
        System.out.flush();
        int res = sc.nextInt();
        return res;
    }

    private static void answer(int k) {
        System.out.println("! " + k);
        System.out.flush();
    }
}
