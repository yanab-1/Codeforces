import java.util.Scanner;

public class A_1177 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int digits=0;
        int b=0;
        int a=0;
        for(int i=1;i<=4;i++){
            a=a*10;
            b=b*10+9;
            if(i==1){
                a=1;
            }
            digits=(b-a+1)*i;
            if(n-digits>0){
                n-=digits;
                continue;
            }
            a+=(n-1)/i;
            String s=String.valueOf(a);
            System.out.println(s.charAt((n-1)%i));
            return;
        }
    }
}
