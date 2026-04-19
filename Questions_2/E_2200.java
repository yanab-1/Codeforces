import java.util.Scanner;
import java.util.TreeSet;

public class E_2200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = prime(a[i]);
        }
        if (isSorted(a)) {
            System.out.println("Bob");
        } else if (minElement(b) == -1) {
            System.out.println("Alice");
        } else if (isSorted(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }

    private static int prime(int x) {
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 2; i * i <= x; i++) {
            while (x % i == 0) {
                s.add(i);
                x /= i;
            }
        }
        if (x > 1) s.add(x);
        if (s.size() > 1) return -1;
        if (s.size() == 0) return 1;
        return s.first();
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    private static int minElement(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            min = Math.min(min, x);
        }
        return min;
    }
}
