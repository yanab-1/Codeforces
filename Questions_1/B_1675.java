import java.util.Scanner;

public class B_1675{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int op=0;
            boolean flag=false;
            for(int i=n-1;i>0;i--){
                while(a[i-1]>=a[i]){
                    a[i-1]/=2;
                    op++;
                    if(a[i-1]==0 && a[i]==0){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                System.out.println(-1);
                continue;
            }
            System.out.println(op);
        }
    }
}