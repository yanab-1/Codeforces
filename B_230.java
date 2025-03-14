
import java.util.HashSet;
import java.util.Scanner;

public class B_230 {
    static HashSet<Long> Set=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sieve();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            if(Set.contains(x)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static void Sieve(){
        int n=1000000;
        boolean[] prime=new boolean[n+1];
        prime[0]=prime[1]=true;
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                for(int j=2;j*i<=n;j++){
                    prime[i*j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                Set.add((long)i*i);
            }
        }
    }
}
