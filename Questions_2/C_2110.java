import java.util.Scanner;
import java.util.Stack;

public class C_2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = sc.nextInt();
        }
        int[][] q = new int[n][2];
        for(int i = 0; i < n; i++){
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
        }
        int h = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            int l = q[i][0];
            int r = q[i][1];
            if(d[i] == -1){
                st.push(i);
            }
            else{
                h += d[i];
            }
            while(h < l){
                if(st.isEmpty()){
                    System.out.println(-1);
                    return;
                }
                d[st.pop()] = 1;
                h++; 
            }
            while(h + st.size() > r){
                if(st.isEmpty()){
                    System.out.println(-1);
                    return;
                }
                d[st.pop()] = 0;
            }
        }
        for(int i : d){
            System.out.print(Math.max(0, i) + " ");
        }
        System.out.println();
    }
}
