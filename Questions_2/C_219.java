import java.util.Scanner;

public class C_219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        if(k == 2) {
            StringBuilder p1 = new StringBuilder();
            StringBuilder p2 = new StringBuilder();
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    p1.append('A');
                    p2.append('B');
                } else {
                    p1.append('B');
                    p2.append('A');
                }
            }
            int diff1 = 0;
            int diff2 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != p1.charAt(i)) diff1++;
                if (s.charAt(i) != p2.charAt(i)) diff2++;
            }
            if (diff1 <= diff2) {
                System.out.println(diff1);
                System.out.println(p1);
            } else {
                System.out.println(diff2);
                System.out.println(p2);
            }
            return;
        }
        char[] arr = s.toCharArray();
        int c = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[i - 1]) {
                c++;
                for(char ch = 'A'; ch < 'A' + k; ch++) {
                    char next = (i + 1 < n) ? arr[i + 1] : '#';
                    if (ch != arr[i - 1] && ch != next) {
                        arr[i] = ch;
                        break;
                    }
                }
            }
        }
        System.out.println(c);
        System.out.println(new String(arr));
    }
}
