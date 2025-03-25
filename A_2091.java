import java.util.Scanner;

public class A_2091 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=0;
            int[] c=new int[10];
            for(int i=0;i<n;i++){
                c[a[i]]++;
                if(c[0]>=3 && c[1]>=1 && c[2]>=2 && c[5]>=1 && c[3]>=1){
                    ans=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
