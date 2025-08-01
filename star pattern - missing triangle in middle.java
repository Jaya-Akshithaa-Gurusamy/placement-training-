import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sp = 0;
        int st = n;
        for(int i = 0;i<n;i++){
            for(int j=0;j<st;j++){
              System.out.print("*");
            }   
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=0;j<st;j++){
              System.out.print("*");
            }
            System.out.println();
            sp+=2;
            st--;
        }
    }
}
