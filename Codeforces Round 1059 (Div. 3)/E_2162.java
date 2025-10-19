import java.util.Scanner;

public class E_2162 {
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
        int[] arr = new int[n];
        int[] freq = new int[n + 2];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
        }
        int x = -1;
        for(int i = 1; i <= n; i++){
            if(freq[i] == 0){
                x = i;
                break;
            }
        }
        if(x == -1){
            for(int i = 0; i < k; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else{
            int y = -1;
            for(int i = 1; i <= n; i++){
                if(i != arr[n - 1] && i != x){
                    y = i;
                    break;
                }
            }
            int[] val = {x, y, arr[n - 1]};
            for(int i = 0; i < k; i++){
                System.out.print(val[i % 3] + " ");
            }
            System.out.println();
        }
    }
}
