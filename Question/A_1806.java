import java.util.Scanner;

public class A_1806{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(d<b){
                System.out.println(-1);
                continue;
            }
            int ans=Math.abs(d-b);
            a+=ans;
            if(c>a){
                System.out.println(-1);
                continue;
            }
            ans+=Math.abs(c-a);
            System.out.println(ans);
        }

    }
}