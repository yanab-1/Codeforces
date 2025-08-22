
import java.util.Scanner;

public class  A_1155{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        print(s, n);
    }
    public static void print(String s,int n){
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)>s.charAt(i)){
                System.out.println("yes");
                System.out.println((i)+" "+(i+1));
                return;
            }
        }
        System.out.println("no");
    } 
}
