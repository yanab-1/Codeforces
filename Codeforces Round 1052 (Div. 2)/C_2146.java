import java.util.Scanner;

public class C_2146 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = i + 1;
        }
        int l = 0;
        int r = 0;
        while(l < n){
            while(r < n && s.charAt(r) == s.charAt(l)){
                r++;
            }
            if(s.charAt(l) == '0'){
                if(r - l == 1){
                    System.out.println("NO");
                    return;
                }
                int temp = p[l];
                p[l] = p[r - 1];
                p[r - 1] = temp;
            }
            l = r;
        }
        System.out.println("YES");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();   
    }
}
