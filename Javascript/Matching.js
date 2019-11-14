/**
 * Given a balanced string s split it in the maximum amount of balanced strings.
    Return the maximum amount of splitted balanced strings.
    
    Input: s = "RLRRLLRLRL"
    Output: 4
    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
var balancedStringSplit = function(s) {
    let lCount = 0;
    let rCount =0;
    let matchCount=0;
    for(let i =0;i<s.length;i++){
        if(s[i]=="L"){
            lCount++;
        }
        if(s[i]=="R"){
            rCount++;
        }
        if(lCount==rCount){
            lCount=0;
            rCount=0;
            matchCount++;
        }
    }
    return matchCount;
};
console.log(balancedStringSplit("LRLLRR"))