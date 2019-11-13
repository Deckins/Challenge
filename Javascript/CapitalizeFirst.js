/*
Capitalize only the first letter of each word
*/
function LetterCapitalize(str) { 

  let split = str.split(" ");
  for(let i = 0; i<split.length; i++){
    split[i] = split[i].charAt(0).toUpperCase() + split[i].slice(1);
    
  }
  str=split.join(" ")
  return str;

}
   
// keep this function call here 
console.log(LetterCapitalize(readline()));