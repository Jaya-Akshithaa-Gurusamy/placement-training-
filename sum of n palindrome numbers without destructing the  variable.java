import java.util.*;
public class Main
{
    public static boolean palin(int n){
        int rev = 0,mod = 10,div = 1,rem = 0;
        while(div<=n){ 
            rem = n % mod;
            rem /= div;
            mod *= 10;
            div *= 10;
            rev = rev * 10 + rem;
        }
        return rev==n;
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
