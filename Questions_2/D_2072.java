import java.util.Scanner;

public class D_2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int l = n;
        int r = n;
        int prev = 0;
        for(int i = 0; i < n; i++){
            int max = 0;
            int min = 0;
            for(int j = i + 1; j < n; j++){
                if(a[i] < a[j]) max++;
                if(a[i] > a[j]) min++;
                int dif = min - max;
                if(prev < dif){
                    l = i + 1;
                    r = j + 1;
                    prev = dif;
                }
            }
        }
        System.out.println(l + " " + r);
    }
}
