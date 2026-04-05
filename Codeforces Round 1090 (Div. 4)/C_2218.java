import java.util.Scanner;

public class C_2218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[3 * n];
        int i = 1;
        int j = 3 * n;
        int idx = 0;
        while(i < j){
            arr[idx++] = i++;
            arr[idx++] = j--;
            arr[idx++] = j--;
        }
        for(i = 0; i < 3 * n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
