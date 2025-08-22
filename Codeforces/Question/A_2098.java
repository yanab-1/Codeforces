
import java.util.Scanner;

public class A_2098 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int[] arr=new int[10];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'0']++; 
            }
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<11;i++){
                int digit=10-i;
                while(true){
                    if(arr[digit]>0){
                        sb.append(digit);
                        arr[digit]--;
                        break;
                    }
                    digit++;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
