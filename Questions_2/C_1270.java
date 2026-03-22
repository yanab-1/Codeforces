import java.util.Scanner;

public class C_1270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long sum = 0;
        long xor = 0;
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            sum += x;
            xor ^= x;
        }
        System.out.println(2);;
        System.out.println((sum + xor) + " " + xor);
    }
}
