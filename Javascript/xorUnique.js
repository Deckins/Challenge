//XOR operator compares bits
//If either bit does not equal each other it returns 1
//  0 1 0   
//  1 0 1
//==1 1 1
function xor(array){
    let result = 0;
    for(let i = 0; i<array.length; i++){
        result ^= array[i]
    }
    if(result == 0){
        return -1;
    } else {
        return result;
    }
}
function xorHash(array){
    let hashMap = {};
    for(let i =0; i<array.length; i++){
        if(hashMap[array[i]] == null){
            hashMap[array[i]] = 1
        } else {
            hashMap[array[i]]++;
        }
    }
    console.log(hashMap)
    // for(let i=0;i<hashMap.length;i++){
    //     if(hashMap[i] === 1){
    //         console.log(i)
    //         return i;
    //     }
    // }
    // hashMap.map(hash =>console.log(hash) )
    for(let [key,value] of Object.entries(hashMap)){
        
        if(value ==1){
            return key;
        }
    }
}
// console.log(xor([1,3,2,1,3]));
console.log(xorHash([1,3,5,1,3]));