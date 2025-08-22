import java.util.Scanner;

public class A_2117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int idx=-1;
            for(int i=0;i<n;i++){
                if(a[i]==1){
                    idx=i;
                    break;
                }
            }
            if(idx==-1){
                System.out.println("yes");
                continue;
            }
            int j=n;
            for(int i=n-1;i>=0;i--){
                if(a[i]==1){
                    j=i;
                    break;
                }
            }
            if(x<j-idx+1){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
