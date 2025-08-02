import java.util.*;
public class Main
{
    public static int amicable(int n){
        int sum=0;
        for(int i = 1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    if(amicable(n)==m&&amicable(m)==n){
	        System.out.print(n+" and "+m+" amicable numbers");
	    }
		else
		    System.out.print(n+" and "+m+" not amicable numbers");
	}
}
