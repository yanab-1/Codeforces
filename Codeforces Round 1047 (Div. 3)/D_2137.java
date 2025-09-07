import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class D_2137 {
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
        int[] freq = new int[n + 1];
        Map<Integer, List<Integer>> map = new java.util.HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            freq[arr[i]]++;
            if(!map.containsKey(arr[i])){
                map.put(arr[i], new java.util.ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
        for(int i = 0; i <= n; i++){
            if(freq[i] > 0 && freq[i] % i != 0){
                System.out.println("-1");
                return;
            }
        }
        int[] res = new int[n];
        int c = 1;
        for(int key : map.keySet()){
            List<Integer> list = map.get(key);
            for(int i = 0; i < list.size(); i++){
                res[list.get(i)] = c;
                if((i + 1) % key == 0){
                    c++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
