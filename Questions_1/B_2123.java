import java.util.Scanner;

public class B_2123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            print(arr,n,j,k);
        }
    }

    private static void print(int[] arr, int n, int j, int k) {
        if(k>1){
            System.out.println("yes");
        }
        else{
            int max=arr[0];
            for(int i=1; i<n; i++) {
                if(arr[i]>max) {
                    max = arr[i];
                }
            }
            if(max==arr[j-1]) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }
        }
    }

}
