import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        List<Integer> positions = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                positions.add(i);   
            }
        }
        System.out.println(positions.size());
        for(int pos : positions){
            System.out.print((pos + 1) + " ");
        }
        System.out.println();
    }
}
