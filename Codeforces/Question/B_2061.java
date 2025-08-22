import java.util.*;

public class B_2061 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            boolean flag=false;
            for(int i=0;i<n-3;i++){
                if(a[i]==a[i+3]){
                    System.out.println(a[i]+" "+a[i]+" "+a[i]+" "+a[i]);
                    flag=true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    list.add(a[i]);
                    i++;
                }
            }
            if(list.size()>=2){
                System.out.println(list.get(0)+" "+list.get(0)+" "+list.get(1)+" "+list.get(1));
                flag=true;
            }
            else if(list.size()==1){
                ArrayList<Integer> ans=new ArrayList<>();
                int c=0;
                for(int i:a){
                    if(i==list.get(0) && c<2){
                        c++;
                    }
                    else{
                        ans.add(i);
                    }
                }
                for(int i=0;i<ans.size()-1;i++){
                    if(ans.get(i+1)-ans.get(i)<2L*list.get(0)){
                        System.out.println(list.get(0)+" "+list.get(0)+" "+ans.get(i)+" "+ans.get(i+1));
                        flag=true;
                        break;
                    }
                }
            }
            if(!flag){
                System.out.println("-1");
            }
        }
    }
}

