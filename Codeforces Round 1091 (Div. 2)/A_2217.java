import java.util.Scanner;

public class A_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int add = k * n;
        if(sum % 2 == 1 || add % 2 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
