import java.util.PriorityQueue;
import java.util.Scanner;

public class B_2181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>((x, y) -> y - x);
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        PriorityQueue<Integer> b = new PriorityQueue<>((x, y) -> y - x);
        for(int i = 0; i < m; i++){
            b.add(sc.nextInt());
        }
        boolean ok = true;
        while(!a.isEmpty() && !b.isEmpty()){
            if(ok){
                int x = a.peek();
                int y = b.peek();
                if(x >= y){
                    b.poll();
                }
                else{
                    b.poll();
                    b.add(y - x);
                }
            }
            else{
                int x = b.peek();
                int y = a.peek();
                if(x >= y){
                    a.poll();
                }
                else{
                    a.poll();
                    a.add(y - x);
                }
            }
            ok = !ok;
        }
        if(a.isEmpty()){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
}
