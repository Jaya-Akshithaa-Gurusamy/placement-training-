import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		int n = s.length();
		int st = n ;
		for(int i=0;i<n;i++){
		    for(int j=0;j<st;j++){
                if(i==0)
		            System.out.print(s.charAt(j)+" ");
		        else if(j==0)
		            System.out.print(s.charAt(i)+" ");
		        else if(i==n-1)
		            System.out.print(s.charAt(n-j-1)+" ");
		        else if(j==n-1)
		            System.out.print(s.charAt(n-i-1)+" ");
		        else 
		            System.out.print("  ");
		    }
		    System.out.println();
		}
	}
}
