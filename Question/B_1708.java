    import java.util.Scanner;

    public class B_1708 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                solve(sc);
            }
        }

        private static void solve(Scanner sc) {
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int[] a=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=((l-1)/i+1)*i;
                if(a[i]>r){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            for(int i=1;i<=n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
