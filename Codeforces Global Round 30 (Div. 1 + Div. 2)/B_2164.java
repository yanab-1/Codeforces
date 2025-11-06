import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                list.add(arr[i]);
            }
        }
        if(arr[0] == 1){
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }
        if(list.size() >= 2){
            System.out.println(list.get(0) + " " + list.get(1));
            return;
        }
        int limit = Math.min(n, 50);
        for (int i = 0; i < limit; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] % arr[i] == 0 || (arr[j] % arr[i]) % 2 == 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
