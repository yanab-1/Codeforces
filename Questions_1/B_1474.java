import java.util.Scanner;

public class B_1474 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int d=sc.nextInt();
            int firprime=0;
            int secprime=0;
            int i=d+1;
            while(true){
                if(prime(i)){
                    firprime=i;
                    break;
                }
                i++;
            }
            i=firprime+d;
            while(true){
                if(prime(i)){
                    secprime=i;
                    break;
                }
                i++;
            }
            long ans1=(long)firprime*firprime*firprime;
            long ans2=(long)firprime*secprime;
            System.out.println(Math.min(ans1,ans2));
        }
    }
    public static boolean prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
