import java.util.Scanner;

public class D_2060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean isPossible = true;
            long remainder = 0; // Tracks leftover from reductions

            for (int i = 0; i < n; i++) {
                if (a[i] < remainder) {
                    isPossible = false; // Cannot satisfy non-decreasing condition
                    break;
                }
                remainder = a[i] - remainder; // Update remainder for the next step
            }

            if (isPossible) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
