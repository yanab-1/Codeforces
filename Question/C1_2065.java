import java.util.Scanner;

public class C1_2065 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int b=sc.nextInt();
            boolean flag=true;
            int prev=Math.min(a[0],b-a[0]);
            for(int i=1;i<n;i++){
                int c=a[i];
                int fil=b-a[i];
                if(c>=prev && fil>=prev){
                    prev=Math.min(c,fil);
                }
                else if(c>=prev){
                    prev=c;
                }
                else if(fil>=prev){
                    prev=fil;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}