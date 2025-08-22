import java.util.Scanner;

public class A_2114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=Integer.parseInt(s);
            int r=(int) Math.sqrt(n);
            if(r*r==n){
                int a=r/2;
                int b=r-a;
                System.out.println(a+" "+b);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
