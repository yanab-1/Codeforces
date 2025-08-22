
import java.util.ArrayList;
import java.util.Scanner;

public class E_2091 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int[] t=new int[n];
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
            max=Math.max(max,t[i]);
        }
        ArrayList<Integer> prime=prime_seive(max);
        for(int i:t){
            long ans=0;
            for(int p:prime){
                if(p>i){
                    break;
                }
                ans+=(i/p);
            }
            System.out.println(ans);
        }

    }
    public static ArrayList<Integer> prime_seive(int n){
        int[] ans = new int[n+1];
		ans[0] = ans[1] = 1;
		for (int i = 2; i * i <= ans.length; i++) {
			if (ans[i] == 0) {
				for (int j = 2; i * j < ans.length; j++) {
					ans[i * j] = 1;
				}
			}
		}
        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(ans[i]==0){
                primes.add(i);
            }
        }
        return primes;
    }
}
