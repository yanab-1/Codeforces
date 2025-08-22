import java.util.Scanner;
 
public class A_2067{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x + 1 >= y && (x + 1 - y) % 9 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}