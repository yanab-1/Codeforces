import java.util.Scanner;

public class B_2106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[n];
            int c=0;
            for(int i=0;i<n-1;i++){
                if(i==x){
                    c++;
                }
                a[i]=c;
                c++;
            }
            if(x>=n){
                a[n-1]=c;
            }
            else{
                a[n-1]=x;
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
