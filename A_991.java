import java.util.Scanner;

public class A_991 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }
    public static void solve(Scanner sc){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        int visit=a+b-c;
        if(visit+1>n || a<c || b<c){
            System.out.println(-1);
        }
        else{
            System.out.println(n-visit);
        }
    }
}
