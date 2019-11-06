/*
Reverse a string
 */

function FirstReverse(str) { 

    // code goes here  
    
    let newStr="";
    let i;
    for(i=0;i<str.length;i++){
      newStr +=str[str.length-i-1];
    }
    return newStr;
  }

console.log(FirstReverse("Howdy"))