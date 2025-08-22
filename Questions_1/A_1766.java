
import java.util.ArrayList;
import java.util.Scanner;

public class A_1766 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<1000000;i++){
            if(check(i)){
                a.add(i);
            }
        }
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            for(int i:a){
                if(i<=n){
                    ans++;
                }
                else{
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    public static boolean check(int n){
        int c=0;
        while(n>0){
            if(n%10!=0){
                c++;
            }
            n/=10;
            if(c>=2){
                return false;
            }
        }
        return c==1;
    }
}
