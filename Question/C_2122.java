import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C_2122 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] points = new int[n][3];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            points[i][2] = i+1;
        }
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        int mid=n/2;
        int[][] firstHalf = Arrays.copyOfRange(points, 0, mid);
        int[][] secondHalf = Arrays.copyOfRange(points, mid, n);
        Arrays.sort(firstHalf, Comparator.comparingInt(a -> a[1]));
        Arrays.sort(secondHalf, (a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < mid; i++) {
            System.out.println(firstHalf[i][2] + " " + secondHalf[i][2]);
        }
    }
}
