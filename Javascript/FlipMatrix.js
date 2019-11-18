/**
 * @param {number[][]} A
 * @return {number[][]}
 * Flip the elements in the matrix(An array of arrays)
 */
var flipAndInvertImage = function(A) {
    for(let i = 0; i<A.length; i++){
        for(let j = 0; j<A[i].length;j++){
             if(A[i][j]==0){
                A[i][j] = 1;
            } else{
                A[i][j] = 0;
            }
        }
        for(let j = 0; j<A[i].length/2; j++){
            let temp =  A[i][j];          
            A[i][j] = A[i][A[i].length - j-1];
            A[i][A[i].length - j-1] = temp;
          
            
        }
      
        
    }
     return A;
 };

 let arr = [[1,0,1],[1,1,1],[0,1,0]];
 console.log(flipAndInvertImage(arr));