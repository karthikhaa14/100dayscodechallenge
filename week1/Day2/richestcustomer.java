class Solution {
    public int maximumWealth(int[][] accounts) {
        int eachsum=0,k=0;
        int m=accounts.length,n=accounts[0].length;
        int max[]=new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                eachsum+=accounts[i][j];
            }
            max[k++]=eachsum;
            eachsum=0;
        }
        Arrays.sort(max);
        return(max[k-1]);
    }
}
