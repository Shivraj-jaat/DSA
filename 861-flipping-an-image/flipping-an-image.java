class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;


        for(int i=0; i<n; i++){
           int p = 0;
           int q = m-1;
           while(p < q){
             int temp = image[i][q];
             image[i][q] = image[i][p];
             image[i][p] = temp;
             p++;
             q--;
           }
        }

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(image[i][j] == 0){
                        image[i][j] = 1;
                    }
                    else{
                         image[i][j] = 0;
                    }
                }
            }
    return image;
    }
}