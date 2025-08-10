import java.util.*;
public class Main
{
    public static int power(int base, int pow){
        if(pow == 0) return 1;
        return base * power(base,pow-1);
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int base = scn.nextInt();
		int pow = scn.nextInt();
		System.out.print(power(base,pow));
	}
}
