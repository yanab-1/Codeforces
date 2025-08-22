import java.util.*;
public class C_1989{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc){
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();  
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();  
        }
        int ratA = 0, ratB = 0, neg = 0, pos = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == b[i] && a[i] == -1){
                neg++;
            }
            else if(a[i] == 1 && b[i] == 1){
                pos++;
            }
            else{
                if(a[i] >= b[i]){
                    ratA += a[i];
                } else {
                    ratB += b[i];
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i = -neg; i <= pos; i++){
            ans = Math.max(ans, Math.min(ratA + i, ratB + pos - i - neg));
        }
        System.out.println(ans);
    }

}