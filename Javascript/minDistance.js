var minTimeToVisitAllPoints = function(points) {
    let secCount = 0;
    for(let i = 0; i<points.length-1; i++){
        let a = points[i][0]
        let b = points[i][1]
        let aNext = points[i+1][0]
        let bNext = points[i+1][1]
        // console.log(points.length)
        // console.log(i)
        // console.log(a,b)
        while(a !== aNext || b !== bNext){
            console.log(a,b,secCount)
            // console.log(1)
             if(a < aNext && b < bNext){
                a+=1;
                b+=1;
                secCount+=1;
                // continue;
             }else{
                 if(a<aNext){
                    a+=1;
                    secCount+=1;
                 }
                 
                 if(b<bNext){
                    b+=1;
                    secCount+=1;
                 } 
             }
            if(a > aNext && b > bNext){
                a-=1;
                b-=1;
                secCount+=1
                // continue;
            } else {
                if(a > aNext){
                    a-=1;
                    secCount+=1;
                }
                if(b > bNext){
                    b-=1;
                    secCount+=1;
                }
            }
              
        }
       
    }
     return secCount;
};
console.log(minTimeToVisitAllPoints([[1,1],[3,4],[0,-1]]))