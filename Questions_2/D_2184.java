import java.util.Scanner;

public class D_2184 {

    static int[][] ncr = new int[32][32];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ncr[0][0] = 1;
        for(int i = 1; i < 32; i++){
            for(int j = 0; j < 32; j++){
                int dia = (j - 1 >= 0) ? ncr[i - 1][j - 1] : 0;
                int left = (i - 1 >= j) ? ncr[i - 1][j] : 0;
                ncr[i][j] = dia + left;
            }
        }
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int msb = 31 - Integer.numberOfLeadingZeros(n);
        for(int i = 0; i < msb; i++){
            for(int j = 0; j <= i; j++){
                if(i + j + 1 > k) break;
                ans += ncr[i][j];
            }
        }
        if(msb < k) ans++;
        System.out.println(n - ans);
    }
}
