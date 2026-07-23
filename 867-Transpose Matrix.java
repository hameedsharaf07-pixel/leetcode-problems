class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        int tro = matrix.length , tcn = matrix[0].length ;
        int nrw = tcn , ncn = tro;
        int ans [][] = new int[nrw][ncn];
        for(int i = 0; i<nrw; i++){
            for(int j = 0; j<ncn; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
