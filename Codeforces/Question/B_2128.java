import java.util.*;

public class B_2128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        Deque<Integer> p = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            p.addLast(sc.nextInt());
        }
        StringBuilder sb=new StringBuilder();
        boolean small=true;
        while (!p.isEmpty()) {
            if(small){
                if(p.peekFirst()<p.peekLast()){
                    p.pollFirst();
                    sb.append('L');
                }
                else{
                    p.pollLast();
                    sb.append('R');
                }
                small=false;
            }
            else{
                if(p.peekFirst()>p.peekLast()){
                    p.pollFirst();
                    sb.append('L');
                }
                else{
                    p.pollLast();
                    sb.append('R');
                }
                small=true;
            }
        }
        System.out.println(sb.toString());
    }
}
