import java.util.Scanner;

public class A_2146{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[n + 1];
        for(int num : arr){
            freq[num]++;
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int c = 0;
            for(int j = 1; j <= n; j++){
                if(freq[j] >= i){
                    c++;
                }
            }
            ans = Math.max(ans, c * i);
        }
        System.out.println(ans);
    }
}