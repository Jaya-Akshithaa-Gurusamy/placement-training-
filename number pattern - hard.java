import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int st = 1;
    int sa = 1;
    for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print(j+" ");
            }
            System.out.print(" ");
            for(int j=n;j>=sa;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            st++;sa++;
        }
}}
