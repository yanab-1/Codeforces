import java.util.Scanner;

public class A_2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            if(l==1 && r==1){
                System.out.println(1);
                continue;
            }
            System.out.println(r-l);
        }
    }
}
