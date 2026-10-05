class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o=image[sr][sc];
        if(o==color){
            return image;
        }
        ch(image,sr,sc,color,o);
        return image;
        
    }
    void ch(int [][]in,int i,int j,int co,int o){
        if(i<0||j<0||i>=in.length||j>=in[0].length){
            return ;
        }
        if(in[i][j]!=o){
            return;
        }
        in[i][j]=co;
        ch(in,i-1,j,co,o);
        ch(in,i+1,j,co,o);
        ch(in,i,j-1,co,o);
        ch(in,i,j+1,co,o);
    }
}