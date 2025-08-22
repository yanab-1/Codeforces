import java.util.Scanner;

public class A_2112{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            print(a,x,y);
        }
    }

    private static void print(int a, int x, int y) {
        if((x<y && x<=a && a<=y)|| (y<x && y<=a && a<=x)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}