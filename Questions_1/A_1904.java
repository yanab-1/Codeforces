
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_1904 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int xk=sc.nextInt();
            int yk=sc.nextInt();
            int xq=sc.nextInt();
            int yq=sc.nextInt();
            int[] x={-1,-1,1,1};
            int[] y={-1,1,-1,1};
            HashSet<List<Integer>> king=new HashSet<>();
            HashSet<List<Integer>> queen=new HashSet<>();
            for(int i=0;i<4;i++){
                List<Integer> k=new ArrayList<>();
                k.add(xk+a*x[i]);
                k.add(yk+b*y[i]);
                king.add(k);
                k=new ArrayList<>();
                k.add(xk+b*x[i]);
                k.add(yk+a*y[i]);
                king.add(k);
                k=new ArrayList<>();
                k.add(xq+a*x[i]);
                k.add(yq+b*y[i]);
                queen.add(k);
                k=new ArrayList<>();
                k.add(xq+b*x[i]);
                k.add(yq+a*y[i]);
                queen.add(k);
            }
            int ans=0;
            for(List<Integer> k:king){
                for(List<Integer> q:queen){
                    if(k.get(0).equals(q.get(0)) && k.get(1).equals(q.get(1))){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
