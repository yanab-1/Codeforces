import java.util.ArrayList;
import java.util.Scanner;
public class B_2129{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            int j=0;
            while(a.get(j)!=i){
                j++;
            }
            ans+=Math.min(j,a.size()-j-1);
            a.remove(j);
        }
        System.out.println(ans);
    }
}