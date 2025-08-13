import java.util.*;

public class Main {
	public static void main(String[] args) {
	    int n = 8;
	    System.out.print("O(1) Example : ");
	    for(int i=0;i<5;i++) System.out.print(i+" ");
	    System.out.println("\n");
	    
	    System.out.print("O(n) Example : ");
	    for(int i=0;i<n;i++) System.out.print(i+" ");
	    System.out.println("\n");
	    
	    System.out.print("O(log n) Example : ");
	    for(int i=1;i<=n;i*=2) System.out.print(i+" ");
	    System.out.println("\n");
	    
	    System.out.print("O(n log n) Example : ");
	    for(int i=0;i<n;i++){
	        for(int j=1;j<=n;j++){
	            System.out.print("("+i+","+j+") ");
	        }
	    }
	    System.out.println("\n");
	    
	    System.out.println("O(n²) Example:");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("(" + i + "," + j + ") ");
	            
	        }
	        System.out.println();
	    }
	}
}
