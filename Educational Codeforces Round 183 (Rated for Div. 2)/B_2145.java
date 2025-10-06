import java.util.Scanner;

public class B_2145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        if(n - k == 0){
            for(int i = 0; i < n; i++){
                System.out.print('-');
            }
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                c0++;
            }
            else if(c == '1'){
                c1++;
            }
            else{
                c2++;
            }
        }
        for(int i = 1; i <= n; i++){
            if(i < 1 + c0 || i > n - c1){
                sb.append('-');
            }
            else if(i >= 1 + c0 + c2 && i <= n - c2 - c1){
                sb.append('+');
            }
            else{
                sb.append('?');
            }
        }
        System.out.println(sb.toString());
    }
}
