import java.util.*;
public class Main
{
    public static int sumofsqd(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return (sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        while(sumofsqd(n)!=t){
            if(sumofsqd(n)==1){
                System.out.print("happy");
                return;
            }
            n=sumofsqd(n);
        }
        System.out.print("not happy");
        
    }
}
