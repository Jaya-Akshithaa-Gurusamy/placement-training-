import java.util.*;
public class Main
{
    public static boolean palin(int n){
        int r=0,rev=0,m=n;
        while(n!=0){
            r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        return rev==m;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0,c=1,i=1;
	    while(c<=n){
	        if(palin(i)){
	            sum+=i;
	            c++;
	        }
	        i++;
	    }
		System.out.print(sum);
	}
}
