import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_2176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a % 2 == 0) even.add(a);
            else odd.add(a);
        }
        if(odd.isEmpty()){
            for(int i = 0; i < n; i++){
                System.out.print(0 + " ");
            }
            System.out.println();
            return;
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(even);
        long[] evenPre = new long[even.size()];
        if(even.size() > 0) {
            evenPre[0] = even.get(0);
            for(int i = 1; i < evenPre.length; i++){
                evenPre[i] = evenPre[i - 1] + even.get(i);
            }
        }
        int oddSize = odd.size();
        System.out.print(odd.get(oddSize - 1) + " ");
        int oddCount = 1;
        int evenCount = 0;
        for(int i = 1; i < n; i++){
            if(evenCount < even.size()){
                evenCount++;
            }
            else{
                if(oddCount + 2 <= oddSize && evenCount > 0){
                    evenCount--;
                    oddCount += 2;
                }
                else{
                    oddCount++;
                }
            }
            if(oddCount % 2 != 0){
                System.out.print((odd.get(oddSize - 1) + (evenCount > 0 ? evenPre[evenCount - 1] : 0)) + " ");
            }
            else{
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }

}
