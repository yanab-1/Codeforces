import java .util.*;
public class A_2065 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String s=sc.nextLine();
            System.out.println(s.substring(0,s.length()-2)+"i");
        }
    }
}
