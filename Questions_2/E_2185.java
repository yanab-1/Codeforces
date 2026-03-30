import java.util.*;

public class E_2185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for(int i = 0; i < m ; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);

        String s = sc.next();

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int idx = lowerBound(b, a[i]);

            // LEFT lava
            if(idx > 0){
                int dis = a[i] - b[idx - 1];
                map.computeIfAbsent(-dis, x -> new ArrayList<>()).add(i);
            }

            // RIGHT lava
            if(idx < m){
                int dis = b[idx] - a[i];
                map.computeIfAbsent(dis, x -> new ArrayList<>()).add(i);
            }
        }

        int ans = n;
        boolean[] is = new boolean[n];
        int cur = 0;

        StringBuilder out = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == 'L') cur--;
            else cur++;

            if(map.containsKey(cur)){
                for(int i : map.get(cur)){
                    if(!is[i]){
                        ans--;
                        is[i] = true;
                    }
                }
                map.get(cur).clear();
            }

            out.append(ans).append(" ");
        }

        System.out.println(out);
    }

    public static int lowerBound(int[] arr, int key) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= key) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}