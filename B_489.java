
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B_489 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] boy=new int[n];
        for(int i=0;i<n;i++){
            boy[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] girl=new int[m];
        for(int i=0;i<m;i++){
            girl[i]=sc.nextInt();
        }
        Arrays.sort(boy);
        Arrays.sort(girl);
        int i=0;
        int j=0;
        int c=0;
        while(i<n && j<m){
            if(Math.abs(boy[i]-girl[j])<=1){
                c++;
                i++;
                j++;
            }
            else if(boy[i]>girl[j]){
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(c);
    }
}
