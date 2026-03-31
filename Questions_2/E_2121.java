import java.util.Scanner;

public class E_2121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        String l = sc.next();
        String r = sc.next();
        if(l.equals(r)) {
            System.out.println(2 * l.length());
            return;
        }
        int ans = 0;
        int i = 0;
        while(l.charAt(i) == r.charAt(i)) {
            ans++;
            i++;
        }
        if(l.charAt(i) + 1 < r.charAt(i)){
            System.out.println(ans * 2);
        }else{
            ans = 2 * ans + 1;
            i++;
            for(; i < l.length(); i++){
                if(l.charAt(i) == '9' && r.charAt(i) == '0') ans++;
                else{
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
