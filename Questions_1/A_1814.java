import java.util.Scanner;

public class A_1814 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(k%2==0 && n%2!=0){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
