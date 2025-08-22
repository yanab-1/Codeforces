
import java.util.Arrays;
import java.util.Scanner;

public class C_1511 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] firPos=new int[51];
        Arrays.fill(firPos,-1);
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            if(firPos[x]==-1){
                firPos[x]=i;
            }
        }
        while(q-->0){
            int x = sc.nextInt();
            int ans=firPos[x];
            System.out.print(ans+" ");
            for(int i=1;i<=50;i++){
                if(firPos[i]<ans){
                    firPos[i]++;
                }   
            }
            firPos[x] = 1;
        }
    }
}
