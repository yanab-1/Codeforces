import java.util.ArrayList;
import java.util.Scanner;

public class B_1862 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(a[0]);
            for(int i=1;i<n;i++){
                if(a[i]>=a[i-1]){
                    ans.add(a[i]);
                }
                else{
                    ans.add(a[i]);
                    ans.add(a[i]);
                }
            }
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
    }
}
