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
    //hashMap: An array of key-value pairs instead of a Map data structure
    // let hashMap = [];
    let myMap = new Map();
    for(let i =0; i<array.length; i++){
        if(myMap.get(array[i]) == null){
           myMap.set(array[i],1)
            // hashMap[array[i]] = 1
        } else {
            myMap.set(array[i],myMap.get(array[i])+1)
            // hashMap[array[i]]++;
        }
    }
    console.log(myMap)
    for(let [key,value] of myMap){
        if(value == 1){
            return key;
        }
    }
    // accessing key and value through Object entires loop
    // hashMap.map(hash =>console.log(hash) )
    // for(let [key,value] of Object.entries(hashMap)){
        
    //     if(value ==1){
    //         return key;
    //     }
    // }
}
// console.log(xor([1,3,2,1,3]));
console.log(xorHash([1,3,9,1,3]));