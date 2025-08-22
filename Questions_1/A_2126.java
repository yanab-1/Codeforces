import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A_2126 {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        List<Integer> ll=new ArrayList<>();
        while(n>0){
            ll.add(n%10);
            n/=10;
        }
        Collections.sort(ll);
        System.out.println(ll.get(0));
    }
}
