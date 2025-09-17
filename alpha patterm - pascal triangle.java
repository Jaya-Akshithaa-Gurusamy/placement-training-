import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(65 + j));  
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)(65 + j));
            }
            System.out.println();
        }
    }
}
