import java.util.Scanner;

public class A_2113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                int temp;
                temp=a;
                a=b;
                b=temp;
                temp=x;
                x=y;
                y=temp;
            }
            int c=0;
            if(k>=a){
                int t1=(k-a)/x+1;
                c+=t1;
                k-=t1*x; 
            }
            if(k>=b){
                int t2=(k-b)/y+1;
                c+=t2;
                k-=t2*y;
            }
            System.out.println(c);
        }
    }
}
