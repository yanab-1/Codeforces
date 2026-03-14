import java.util.Scanner;

public class A_2208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] freq = new int[(n * n) + 1];
        for(int i = 0; i < n * n; i++){
            freq[sc.nextInt()]++;
        }
        for(int i : freq){
            if(i > (n)*(n - 1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
