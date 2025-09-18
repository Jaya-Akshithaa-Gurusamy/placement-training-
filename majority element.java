import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        int c=0,v=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i] == a[j])
                    c++;
                if(c > (n/2)){
                    v = a[i];
                    break;
                }
            }
            c=0;
        }
        System.out.print(v);
    }
}
