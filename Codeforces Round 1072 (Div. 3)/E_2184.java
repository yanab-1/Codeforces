import java.util.*;

public class E_2184 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dif = new int[n - 1];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i > 0){
                dif[i - 1] = Math.abs(arr[i] - arr[i - 1]);
            }
        }
        int[] nxs = new int[n - 1];
        int[] pvs = new int[n - 1];
        Arrays.fill(nxs, n - 1);
        Arrays.fill(pvs, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n - 1; i++){
            while(!stack.isEmpty() && dif[stack.peek()] > dif[i]){
                nxs[stack.pop()] = i;
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = n - 2; i >= 0; i--){
            while(!stack.isEmpty() && dif[stack.peek()] >= dif[i]){
                pvs[stack.pop()] = i;
            }
            stack.push(i);
        }
        long[] ans = new long[n];
        for(int i = 0; i < n - 1; i++){
            int left = i - pvs[i];
            int right = nxs[i] - i;
            ans[dif[i]] += 1l * left * right;
        }
        for(int i = n - 2; i >= 1; i--){
            ans[i] += ans[i + 1];
        }
        for(int i = 1; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
