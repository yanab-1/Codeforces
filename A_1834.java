import java.util.Scanner;

public class A_1834 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
                if(a[i]==-1){
                    c++;
                }
            }
            int ans=0;
            while(sum<0){
                ans++;
                sum+=2;
                c--;
            }
            if(c%2!=0){
                ans++;
            }
            System.out.println(ans);
        }
    }
}
