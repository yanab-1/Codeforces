import java.util.Scanner;

public class A_2109{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==1){
                    c++;
                }
            }
            if(n==2){
                if(a[0]==a[1]){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                continue;
            }
            boolean flag=false;
            if(c>n-1){
                flag=true;
            }
            for(int i=0;i<n-1;i++){
                if(a[i]==0 && a[i+1]==0){
                    flag=true;
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