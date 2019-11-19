/**
 * @param {number[][]} A
 * @return {number[][]}
 * Flip the elements in the matrix(An array of arrays)
 */
var flipAndInvertImage = function(A) {
    for(let i = 0; i<A.length; i++){
        // for(let j = 0; j<A[i].length;j++){
        //      if(A[i][j]==0){
        //         A[i][j] = 1;
        //     } else{
        //         A[i][j] = 0;
        //     }
        // }
        // if(A[i].length % 2 == 1){
        //     // console.log(Math.floor(A[i].length/2))
        //     console.log(A[i][Math.floor(A[i].length/2)])
        //     if(A[i][Math.floor(A[i].length/2)] == 0){
        //         A[i][Math.floor(A[i].length/2)] = 1
        //         console.log("changed to 1")
        //     } else {
        //         A[i][Math.floor(A[i].length/2)] = 0;
        //         console.log("changed to 0")
        //     }
        //     // A[i][Math.floor(A[i].length/2)] === 0 ? 1: 0;
      
        // }
        A[i].reverse();
        for(let j = 0; j< A[i].length; j++){
            // A[i][j] === 0 ? 1 : 0;
            if(A[i][j] == 0){
                A[i][j] = 1;
            } else {
                A[i][j] = 0;
            }
        }
        // for(let j = 0; j<A[i].length/2; j++){
        //     // console.log("flipping")
        //     // let temp =  A[i][j];          
        //     // A[i][j] = A[i][A[i].length - j-1];
        //     // A[i][A[i].length - j-1] = temp;

        //     A[i][j] == 0 ? 1 : 0;
        //     A[i][A[i].length - j -1] == 0 ? 1 : 0
          
            
        // }
        
        
        
    }
     return A;
 };
 var flipAndInvertImage1 = function(A) {
    // take each row, reverse it, then map each number in it and invert it. map returns a list
    return A.map(row => row.reverse().map(num => num  == 0 ? 1 : 0));

};

 let arr = [[1,0,0],[1,1,0],[0,1,1]];
 console.log(flipAndInvertImage(arr));