class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
        int rowB = 0;
        int rowE = matrix.length-1;
        int colB = 0;
        int colE = matrix[0].length-1;
        while(colE >= colB && rowE >= rowB){
            
            for(int i = colB; i<=colE; i++){
                list.add(matrix[rowB][i]);
            }
            rowB++;

            for(int i = rowB; i<=rowE; i++){
                list.add(matrix[i][colE]);
            }
            colE--;
            
            //Condition to check if spiral has completed or not
            //if condition passes then spiral has finished 
            //else keep going
            if(colE < colB || rowE < rowB) break;
            
            for(int i = colE; i>=colB; i--){
                list.add(matrix[rowE][i]);
            }
            rowE--;

            for(int i = rowE; i>=rowB; i--){
                list.add(matrix[i][colB]);
            }
            colB++;  
        }
        return list;
    }
    
}