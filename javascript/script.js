console.log("This is Raja raj");

let myAge = 18;
let myAgeAbove18 = true;
let myName = 'Raja raj'
const bigIntNumber = 11111111111111111111111111111111n
console.log(bigIntNumber)

// Array consist different heteroginious data type 
const friends = [22, 'Raja raj']
friends[0] = 25; // it will work in js even it is const
console.log(friends);

let someSpecialValue; // This will give undefined means it's not initialized and it should not be const
let someSpecialValue1 = null; //explicity saying this value does not exist

console.log(someSpecialValue)
console.log(someSpecialValue1)
someSpecialValue = 22;
console.log(someSpecialValue);

// type of
let myAgeIs = 22;
let myUpdatedAge = (typeof myAgeIs); // Array and null is also an object in javascript
console.log(myUpdatedAge)

// Operator
let num = 22;
let myUpdatedNumber = 22 ** 5 // ** is power in javascript
console.log(myUpdatedNumber)

// find Average
let friendsNum = [2, 3, 4, 5];
let sum = 0;
for (let i = 0; i < 4; i++) {
    sum += friendsNum[i];
}
console.log(sum)

// Increment and decrement
let newNum = 2;
newNum++ // newNum = newNum+1 same
console.log(newNum)

// function
// here no need to declare let or var in parameter
function myFunc(name) {
    console.log("This is " + name)
    return
    console.log("Raja Bhai hai tera")
}

function returnFunc(){
    return "This is Raja raj"
}

myFunc('Raja raj');

let getOutput = returnFunc();
console.log(getOutput)

//  