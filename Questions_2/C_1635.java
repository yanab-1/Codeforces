import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if (arr[n - 1] < arr[n - 2]) {
            System.out.println(-1);
            return;
        }
        if(arr[n - 1] < 0){
            if(isSorted(arr)){
                System.out.println(0);
                return;
            }
            System.out.println(-1);
            return;
        }
        List<int[]> res = new ArrayList<>();
        int diff = arr[n - 1] - arr[n - 2];
        for(int i = n - 3; i >= 0; i--){
            res.add(new int[]{i + 1, n - 1, n});
        }
        System.out.println(res.size());
        for(int[] op : res){
            System.out.println(op[0] + " " + op[1] + " " + op[2]);
        }
    }
    private static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}