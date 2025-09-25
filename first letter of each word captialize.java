import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String arr[]=str.split(" ");
	    for(int i=0;i<arr.length;i++){
	        char[] t=arr[i].toCharArray();
	        t[0] = Character.toUpperCase(t[0]);
	        String ans = new String(t);
	        arr[i] = ans;
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]);
	    }
	}
}
