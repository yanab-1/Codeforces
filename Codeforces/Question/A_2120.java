import java.util.Scanner;

public class A_2120 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l1=sc.nextInt();
            int b1=sc.nextInt();
            int l2=sc.nextInt();
            int b2=sc.nextInt();    
            int l3=sc.nextInt();
            int b3=sc.nextInt();
            print(l1, b1, l2, b2, l3, b3);
        }
    }

    private static void print(int l1, int b1, int l2, int b2, int l3, int b3) {
        int s=l1;
        if(l2==s && l3==s && b1+b2+b3==s){
            System.out.println("yes");
            return;
        }
        if(b1<s && b2==b3 && b2+b1==s && l2+l3==s){
            System.out.println("yes");
            return;
        }
        s=b1;
        if(b2==s && b3==s && l1+l2+l3==s){
            System.out.println("yes");
            return;
        }
        if(l1<s && l2==l3 && l2+l1==s && b2+b3==s){
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}
