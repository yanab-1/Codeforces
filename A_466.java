import java.util.Scanner;

public class A_466 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int single=n*a;
        int full=n/m;
        int rem=n%m;
        int tic=rem*a+full*b;
        int t=(full+1)*b;
        System.out.println(Math.min(single,Math.min(tic,t)));
    }
}
