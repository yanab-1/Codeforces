
    import java.util.Scanner;

    public class B_1704 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int x=sc.nextInt();
                int[] a=new int[n];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                int l=a[0]-x;
                int r=a[0]+x;
                int res=0;
                for(int i=1;i<n;i++){ 
                    l=Math.max(l,a[i]-x);
                    r=Math.min(r,a[i]+x);
                    if(l>r){
                        res++;
                        l=a[i]-x;
                        r=a[i]+x;
                    }
                }
                System.out.println(res);
            }
        }
    }
