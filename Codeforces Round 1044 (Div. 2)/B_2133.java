import java.util.Arrays;
import java.util.Scanner;

public class B_2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long ans = 0;
        int i = 0;
        if(arr.length % 2 == 1){
            ans += arr[0];
            i++;
        }
        for( ; i < arr.length; i+=2){
            ans += Math.max(arr[i], arr[i+1]);
        }
        System.out.println(ans);
    }
}
