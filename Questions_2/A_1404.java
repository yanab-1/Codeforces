import java.util.Scanner;

public class A_1404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int cnt0 = 0;
        int cnt1 = 0;
        for(int i = 0; i < k; i++){
            char ch = '.';
            for(int j = i; j < n; j += k){
                if(s.charAt(j) != '?'){
                    if(ch != '.' && ch != s.charAt(j)){
                        System.out.println("NO");
                        return;
                    }               
                    ch = s.charAt(j);
                }
            }
            if(ch == '1'){
                cnt1++;
            } else if(ch == '0'){
                cnt0++;
            }
        }
        if(Math.max(cnt0, cnt1) > k / 2){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
