import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        int msum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j)
                    msum+=a[i][j];
            }
        }
        
        int ssum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i+j==r-1)
                    ssum+=a[i][j];
            }
        }
        
        if(msum!=ssum){
        System.out.println(false);
        return;
        }
        for(int i=0;i<r;i++){
            int sum = 0;
		    for(int j=0;j<c;j++){
                sum+=a[i][j];
            }
            if(msum!=sum){
            System.out.println(false);
                return;}
		}
		
		for(int j=0;j<c;j++){
            int sum = 0;
		    for(int i=0;i<r;i++){
                sum+=a[i][j];
            }
            if(msum!=sum){
            System.out.println(false);
                return;}
		}
        System.out.println(true);
    }
}

