import java.util.Scanner;

public class B_1696 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int i=0;
            int ans=0;
            while(i<n){
                if(a[i]==0){
                    i++;
                    continue;
                }
                while(i<n && a[i]!=0){
                    i++;
                }
                ans++;
            }
            System.out.println(ans>2?2:ans);
        }
    }
}
