import java.util.Scanner;

public class A_2119{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(a==b){
            System.out.println(0);
        }
        else if(a<b){
            long ans=(long)(b-a)*x;
            if(x<y){
                System.out.println(ans);
            }
            else{
                long res=0;
                while(a!=b){
                    if(a%2==0){
                        res+=y;
                    }
                    else{
                        res+=x;
                    }
                    a++;
                }
                System.out.println(res);
            }
        }
        else{
            if((a^1)==b){
                System.out.println(y);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}