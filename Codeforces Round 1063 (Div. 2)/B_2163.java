import java.util.Scanner;

public class B_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] < a[minIdx]) minIdx = i;
            if(a[i] > a[maxIdx]) maxIdx = i;
        }
        String s = sc.next();
        if(s.charAt(0) == '1' || s.charAt(n - 1) == '1'){
            System.out.println(-1);
            return;
        }
        if(s.charAt(maxIdx) == '1' || s.charAt(minIdx) == '1'){
            System.out.println(-1);
            return;
        }
        System.out.println(5);
        System.out.println(1 + " " + (minIdx + 1));
        System.out.println(1 + " " + (maxIdx + 1));
        System.out.println(minIdx + 1 + " " + n);
        System.out.println(maxIdx + 1 + " " + n);
        System.out.println(Math.min(minIdx, maxIdx) + 1 + " " + (Math.max(minIdx, maxIdx) + 1));
    }
}
