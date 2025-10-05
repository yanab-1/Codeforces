import java.util.Scanner;

public class C_2155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] s = new int[n];
        for(int i = 0; i < n - 1; i++){
            s[i] = 1 - (a[i] - a[i + 1]);
        }
        long ways = 0;
        for(int start = 0; start <= 1; start++){
            int[] capes = new int[n];
            capes[0] = start;
            boolean ok = true;
            for(int i = 0; i < n - 1; i++){
                if(s[i] == 1) {
                    capes[i + 1] = 1 - capes[i]; 
                } else {
                    capes[i + 1] = capes[i];  
                }
            }
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            prefix[0] = (capes[0] == 1 ? 1 : 0);
            for(int i = 1; i < n; i++){
                prefix[i] = prefix[i - 1] + (capes[i] == 1 ? 1 : 0);
            }
            suffix[n - 1] = (capes[n - 1] == 0 ? 1 : 0);
            for(int i = n - 2; i >= 0; i--) {
                suffix[i] = suffix[i + 1] + (capes[i] == 0 ? 1 : 0);
            }
            for(int i = 0; i < n && ok; i++){
                int visible = prefix[i] + suffix[i];
                if(visible != a[i]) ok = false;
            }
            if(ok) ways++;
        }
        System.out.println(ways);
    }
}
