import java.util.Scanner;

public class A_2166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) != s.charAt(n - 1)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
