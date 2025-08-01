import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sp = 0;
    int st = (2*n)-1;
    for(int i = 0;i<n;i++){
        for(int j=0;j<sp;j++){
           System.out.print(" ");
        }   
        for(int j=0;j<st;j++){
            System.out.print("*");
        }
        System.out.println();
        st-=2;
        sp++;
    }
}}
