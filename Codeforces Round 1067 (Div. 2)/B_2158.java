import java.util.Scanner;

public class B_2158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[2 * n];
        int[] freq = new int[2 * n + 1];
        for(int i = 0; i < 2 * n; i++){
            a[i] = sc.nextInt();
            freq[a[i]]++;
        }
        int x = 0, y = 0, z = 0;
        for(int i : freq){
            if(i != 0){
                if(i % 2 == 1){
                    x++;
                }
                else if(i % 4 != 0){
                    y++;
                }
                else{
                    z++;
                }
            }
        }
        int ans = x + 2 * (y + z);
        if(x == 0 && z % 2 != 0){
            ans -= 2;
        }
        System.out.println(ans);
    }
}
