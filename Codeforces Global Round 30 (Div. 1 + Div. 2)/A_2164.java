import java.util.Scanner;

public class A_2164 {
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
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int x = sc.nextInt();
        if(n == 1) {
            if(arr[0] == x){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        if(x >= min && x <= max){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    } 
}
