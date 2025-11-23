import java.util.Scanner;

public class A_2157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] freq = new int[n + 1];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            freq[a[i]]++;
        }
        int ans = 0;
        for(int i = 0; i <= n; i++){
            if(freq[i] > 0){
                if(freq[i] != i){
                    if(freq[i] > i){
                        ans += freq[i] - i;
                    }
                    else{
                        ans += freq[i];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
