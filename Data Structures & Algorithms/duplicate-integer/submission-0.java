class Solution {
    public boolean hasDuplicate(int[] a) {
        int n = a.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                return true;
            }
        }
        return false;
    }
}