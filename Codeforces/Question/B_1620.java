import java.util.Scanner;

public class B_1620 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            long ans=0;
            for(int i=0;i<4;i++){
                int k=sc.nextInt();
                int first=sc.nextInt();
                int last=0;
                for(int j=1;j<k;j++){
                    last=sc.nextInt();
                }
                long len=last-first;
                long area=i<2?len*h:len*w;
                ans=Math.max(area,ans);
            }
            System.out.println(ans);
        }
    }
}
