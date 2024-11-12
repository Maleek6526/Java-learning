const multiply = require("./index");

test("multiply each number by 2", ()=>{
    const arrayOfNumbers = [1,2,3,4,5];
    let result = multiply(arrayOfNumbers);
    let answer = [2,4,6,8,10];
    expect(result).toEqual(answer);
})