class Solution {
    public int getSecondLargest(int[] a) {
        int max = -1,max2 = -1;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max2 = max;
                max = a[i];
            }
            if(a[i]<max&&a[i]>max2){
                max2 = a[i];
            }
        }
        return max2;
    }
}
