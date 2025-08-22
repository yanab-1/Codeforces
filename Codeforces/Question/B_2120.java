import java.util.Scanner;

public class B_2120 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int count=0;
            for (int i=0;i<n;i++) {
                int dx=sc.nextInt();
                int dy=sc.nextInt();
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(x==y && dx==dy){
                    count++;
                }
                if(x+y==s && dx!=dy){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
