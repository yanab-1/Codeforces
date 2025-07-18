import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_1742 {
    static List<Integer>[] pairs=new ArrayList[1001]; 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        precomute();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        List<Integer>[] ind=new ArrayList[1001];
        for(int i=0;i<=1000;i++){
            ind[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            ind[x].add(i+1);
        }
        int ans=-1;
        for(int i=1;i<=1000;i++){
            for(int j:pairs[i]){
                if(!ind[i].isEmpty() && !ind[j].isEmpty()){
                    int sum=ind[i].get(ind[i].size()-1)+ind[j].get(ind[j].size()-1);
                    ans=Math.max(ans,sum);
                }
            }
        }
        System.out.println(ans);
    }
    private static void precomute(){
        for(int i=0;i<=1000;i++){
            pairs[i]=new ArrayList<>();
            for(int j=0;j<=1000;j++){
                if(gcd(i,j)==1){
                    pairs[i].add(j);
                }
            }
        }
    }

    private static int gcd(int i, int j) {
        if(j==0){
            return i;
        }
        return gcd(j,i%j);
    }
}
