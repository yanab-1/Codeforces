
import java.util.Scanner;

public class C_2194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] s = new String[k];
        for (int i = 0; i < k; i++) {
            s[i] = sc.next();
        }
        for(int d = 1; d <= n; d++){
            if(n % d != 0){
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < d; j++){
                int a = (1 << 26) -  1;
                for(int x = j; x < n; x += d){
                    int o = 0;
                    for(int i = 0; i < k; i++){
                        o |= 1 << (s[i].charAt(x) - 'a');
                    }
                    a &= o;
                }
                if(a == 0) break;
                int c = Integer.numberOfTrailingZeros(a); 
                sb.append((char)(c + 'a'));
            }
            if(sb.length() < d){
                continue;
            }
            while(sb.length() < n){
                sb.append(sb.substring(0, d));
            }
            System.out.println(sb.toString());
            return;
        }
    }
}
