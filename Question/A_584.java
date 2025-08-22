import java.util.Scanner;

public class A_584{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        if(n==1 && t==10){
            System.out.println(-1);
            return;
        }
        StringBuilder res=new StringBuilder();
        res.append(t);
        while(res.length()<n){
            res.append('0');
        }
        System.out.println(res);
    }
}