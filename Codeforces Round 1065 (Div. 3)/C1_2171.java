import java.util.Scanner;

public class C1_2171 {
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
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int diffCount = 0;
        int lastDiffIndex = -1;
        
        for (int i = 0; i < n; i++) {
            int bVal = sc.nextInt();
            if (a[i] != bVal) {
                diffCount++;
                lastDiffIndex = i + 1;
            }
        }
        
        if (diffCount % 2 == 0) {
            System.out.println("Tie");
        } else {
            if (lastDiffIndex % 2 != 0) {
                System.out.println("Ajisai");
            } else {
                System.out.println("Mai");
            }
        }
    }

}
