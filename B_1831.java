import java.util.Scanner;

public class B_1831 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt(); 
            }
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            int[] sub_a=new int[2*n+1];
            int[] sub_b=new int[2*n+1];
            int c=1;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]){
                    c++;
                }
                else{
                    sub_a[a[i-1]]=Math.max(c,sub_a[a[i-1]]);
                    c=1;
                }
            }
            sub_a[a[n-1]]=Math.max(c,sub_a[a[n-1]]);
            c=1;
            for(int i=1;i<n;i++){
                if(b[i]==b[i-1]){
                    c++;
                }
                else{
                    sub_b[b[i-1]]=Math.max(c,sub_b[b[i-1]]);
                    c=1;
                }
            }
            sub_b[b[n-1]]=Math.max(c,sub_b[b[n-1]]);
            int ans=Integer.MIN_VALUE;
            for(int i=1;i<=2*n;i++){
                ans=Math.max(ans,sub_a[i]+sub_b[i]);
            }
            System.out.println(ans);
        }
    }
}
