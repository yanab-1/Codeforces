import java.util.Scanner;

public class B_1691 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] p=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                p[i]=i+1;
            }
            int i=0;
            int j=0;
            boolean flag=true;
            while(i<n){
                while(i<n-1 && a[i]==a[i+1]){
                    i++;
                }
                if(i==j){
                    flag=false;
                    break;
                }
                else{
                    rotate(p,j,i);
                }
                j=i+1;
                i=j;
            }
            if(flag){
                for(int k:p){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }
    }
    public static void rotate(int[] arr, int start, int end) {
        int temp = arr[start];
        for (int i = start; i < end; i++) {
            arr[i] = arr[i + 1];
        }
        arr[end] = temp;
    }
}
