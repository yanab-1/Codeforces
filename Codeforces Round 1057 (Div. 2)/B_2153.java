import java.util.Scanner;

public class B_2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(isPossible(x, y, z) ? "YES" : "NO");
    }

    private static boolean isPossible(int x, int y, int z) {
        for (int bit = 0; bit < 31; bit++) {
            int xb = (x >> bit) & 1;
            int yb = (y >> bit) & 1;
            int zb = (z >> bit) & 1;
            
            if (!isValidBit(xb, yb, zb)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isValidBit(int xb, int yb, int zb) {
        for (int ai = 0; ai <= 1; ai++) {
            for (int bi = 0; bi <= 1; bi++) {
                for (int ci = 0; ci <= 1; ci++) {
                    if ((ai & bi) == xb && (bi & ci) == yb && (ai & ci) == zb) {
                        return true; 
                    }
                }
            }
        }
        return false; 
    }
}
