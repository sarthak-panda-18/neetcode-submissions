class Solution {
    public int[] twoSum(int[] a, int target) {
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}