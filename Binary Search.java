import java.util.*;
public class Main{
    public static boolean binarySearch(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
        
       while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k)
                return true;
            if(arr[mid]<k){
                low=mid+1;
            }
            else
                high=mid-1;
       }
       return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.print(binarySearch(arr,k));
    }
}
