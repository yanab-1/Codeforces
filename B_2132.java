import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_2132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        Long n = sc.nextLong();
        List<Long> a = new ArrayList<>();
        long i = 10;
        while((n/(i+1))>0){
            if(n%(i+1) == 0){
                a.add((n/(i+1)));
            }
            i*=10;
        }
        if(a.isEmpty()){
            System.out.println(0);
        }
        else{
            Collections.sort(a);
            System.out.println(a.size());
            for(Long num : a){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
