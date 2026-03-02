import java.util.Arrays;
import java.util.Scanner;

public class C_1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        if(k >= 3){
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        long min = arr[0];
        for(int i = 1; i < n; i++){
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        if(k == 1){
            System.out.println(min);
        }
        if(k == 2){
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    long num = arr[j] - arr[i];
                    int idx = lowerBound(arr, num);
                    if (idx < n) {
                        min = Math.min(min, arr[idx] - num);
                    }
                    if (idx > 0) {
                        min = Math.min(min, num - arr[idx - 1]);
                    }
                }
            }
            System.out.println(min);
        }
    }

    private static int lowerBound(long[] arr, long num) {
        int i = 0;
        int j = arr.length - 1;
        int idx = arr.length;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] >= num){
                idx = mid;
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return idx;
    }
}
