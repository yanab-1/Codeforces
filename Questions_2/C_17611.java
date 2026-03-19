import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_17611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        for(int i = 0; i < n; i++){
            List<Integer> ll = new ArrayList<>();
            ll.add(i + 1);
            for(int j = 0; j < n; j++){
                if(j != i && arr[j].charAt(i) == '1'){
                    ll.add(j + 1);
                }
            }
            System.out.print(ll.size() +" ");
            for(int l : ll){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
