/*
    Find the factorial for given number
*/

function FirstFactorial(num) { 
    let prod = 1;
    for(i = 0; i<num; i++){
      prod *= num - i;
    }
    
    // code goes here  
    return prod; 
  
  }

  console.log(FirstFactorial(3))