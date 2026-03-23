import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_1905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        List<Integer> a = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (a.isEmpty() || s.charAt(i) >= s.charAt(a.get(a.size() - 1))) {
                a.add(i);
            }
        }
        Collections.reverse(a);
        int j = 0;
        while (j < a.size() && s.charAt(a.get(0)) == s.charAt(a.get(j))) {
            j++;
        }
        int ans = a.size() - j;
        char[] arr = s.toCharArray();
        int size = a.size();
        for (int i = 0; i < size - 1 - i; i++) {
            int left = a.get(i);
            int right = a.get(size - 1 - i);
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        if (!isSorted(arr)) {
            ans = -1;
        }
        System.out.println(ans);
    }

    private static boolean isSorted(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
