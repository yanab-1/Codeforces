
import java.util.Scanner;

public class C_2060 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[2*n+1];
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                arr[a]++;
            }
            int ans=0;
            for(int i=1;i<arr.length;i++){
                if(k-i>0 && k-i!=i && arr[i]!=0 && arr[k-i]!=0){
                    int m=Math.min(arr[i],arr[k-i]);
                    arr[i]-=m;
                    arr[k-i]-=m;
                    ans+=m;
                }
                else if (k - i == i && arr[i] > 1) { 
                    ans += arr[i] / 2;
                    arr[i] %= 2; 
                }
            }
            System.out.println(ans);
        }
    }
}
