import java.util.Scanner;

public class E_2218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max, a[i] ^ a[j]);
            }
        }
        System.out.println(max);
    }
}
