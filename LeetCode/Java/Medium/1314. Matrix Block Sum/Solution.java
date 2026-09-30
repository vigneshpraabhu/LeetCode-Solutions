class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length,n=mat[0].length;
        int b[][]=new int [m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                b[i][j]=mat[i-1][j-1]+b[i-1][j]+b[i][j-1]-b[i-1][j-1];
            }
        }
        int an[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int t=Math.max(0,i-k);
                int bl=Math.min(m-1,i+k);
                int l=Math.max(0,j-k);
                int r=Math.min(n-1,j+k);
                an[i][j]=b[bl+1][r+1]-b[t][r+1]-b[bl+1][l]+b[t][l];
            }
        }
        return an;
    }
}