import java.util.PriorityQueue;
import java.util.Scanner;

public class B_2218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < 7; i++){
            pq.add(sc.nextInt());
        }
        int sum = 0;
        for(int i = 0; i < 6; i++){
            sum += pq.poll() * -1;
        }
        System.out.println(sum + pq.poll());
    }
}
