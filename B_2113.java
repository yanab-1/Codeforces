import java.util.Scanner;

public class B_2113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            boolean dx=((x1-x2)%a+a)%a==0;
            boolean dy=((y1-y2)%b+b)%b==0;
            boolean vertical=dx && (x1!=x2 || dy);
            boolean horizontal=dy && (y1!=y2 || dx);
            System.out.println(vertical || horizontal?"YES":"NO");
        }                                                                       
    }
}
