class Solution {
    public int[] getConcatenation(int[] a) {
       int n = a.length;
       int ans[] = new int[2*n];
       int idx=0;
       for(int i=0;i<2;i++){
        for(int x:a){
            ans[idx++]=x;
            }
        }
        return ans;
    }
}