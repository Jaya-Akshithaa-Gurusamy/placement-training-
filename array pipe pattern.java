import java.util.*;
public class Main
{
    public static void print(int[] a,int n,int max){
       for(int i=0;i<max;i++){
           for(int j=0;j<n;j++){
                if(a[j]>=n-i)
                   System.out.print("|");
                else
                    System.out.print(" ");
           }
           System.out.println();
       }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int max =0;
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	        if(a[i]>max)
	            max=a[i];
	    }
	    print(a,a.length,max);
	}
}
