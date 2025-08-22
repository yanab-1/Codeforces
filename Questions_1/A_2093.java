import java.util.Scanner;

public class A_2093 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            if(k%2==1){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        } 
    }
}
