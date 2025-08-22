import java.util.Scanner;

public class A_2060 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] arr=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            int a=arr[0]+arr[1];
            int b=arr[2]-arr[1];
            int c=arr[3]-arr[2];
            if(a==b && b==c){
                System.out.println(3);
            }
            else if(a==b || b==c || c==a){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
