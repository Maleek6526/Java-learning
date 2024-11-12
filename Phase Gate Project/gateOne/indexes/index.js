function multiply(array){
    let answer = [];
    array.forEach((num)=>{
        let result = num * 2;
        answer.push(result);
    })
    return answer;
};

module.exports = multiply;
