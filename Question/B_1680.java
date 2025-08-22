
import java.util.Scanner;

public class B_1680 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.next();
            }
            int row=0;
            for(int i=0;i<n;i++){
                boolean flag=false;
                for(int j=0;j<m;j++){
                    if(arr[i].charAt(j)=='R'){
                        row=i;
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            int col=0;
            for(int i=0;i<m;i++){
                boolean flag=false;
                for(int j=0;j<n;j++){
                    if(arr[j].charAt(i)=='R'){
                        col=i;
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(arr[row].charAt(col)=='R'){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
