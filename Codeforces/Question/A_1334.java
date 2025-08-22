import java.util.Scanner;

public class A_1334 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int p=0;
        int c=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<p || y<c || y-c>x-p){
                flag=false;
            }
            p=x;
            c=y;
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
