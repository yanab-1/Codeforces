
import java.util.Scanner;

public class B_279 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] books=new int[n];
        for(int i=0;i<n;i++){
            books[i]=sc.nextInt();
        }
        int ans=0;
        int l=0;
        int time=0;
        for(int i=0;i<n;i++){
            time+=books[i];
            while(time>t){
                time-=books[l];
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        System.out.println(ans);
    }
}
