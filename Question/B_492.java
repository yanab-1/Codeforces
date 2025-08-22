import java.util.*;

public class B_492 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int[] points=new int[n];
        for(int i=0;i<n;i++){
            points[i]=sc.nextInt();
        }
        Arrays.sort(points);
        double gap=0;
        for(int i=1;i<n;i++){
            gap=Math.max(gap,points[i]-points[i-1]);
        }
        double edge=Math.max(points[0],l-points[n-1]);
        double ans=Math.max(edge,gap/2);
        System.out.println(ans);
    }
}
