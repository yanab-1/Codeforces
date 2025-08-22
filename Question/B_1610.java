import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_1610 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[n-i-1]){
                if(check(arr,arr[i]) || check(arr, arr[n - i - 1])) {
                    System.out.println("Yes");
                    return;
                }
                else {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private static boolean check(int[] arr, int item) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != item) {
                list.add(arr[j]);
            }
        }
        int n = list.size();
        for(int i=0;i<n;i++){
            if(!list.get(i).equals(list.get(n-i-1))) {
                return false;
            }
        }
        return true;
    }
}
