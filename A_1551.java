
import java.util.Scanner;

public class A_1551{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=n%3;
            if(ans==0){
                System.out.println(n/3+" "+n/3);
            }
            else if(ans==1){
                System.out.println((n/3+1)+" "+n/3);
            }
            else{
                System.out.println(n/3+" "+(n/3+1));
            }
        }
    }
}