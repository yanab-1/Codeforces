
import java.util.HashSet;
import java.util.Scanner;

public class A_2133 {
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
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(set.contains(arr[i])){
                System.out.println("YES");
                return;
            }
            set.add(arr[i]);
        }
        System.out.println("NO");

    }
}
