console.log("問１");
console.log("相原優");

console.log("問２");
let firstName = "masaru";
let lastName = "aihara";
let fullNmae = firstName + " " + lastName;
console.log(fullNmae);

console.log("問３");
let itemA = 200;
let itemB =250;
let subTotal = itemA * 3 + itemB * 4;
let tax = subTotal * 0.1;
let total = subTotal + tax;
console.log("小計")
console.log(subTotal + "円");
console.log("消費税");
console.log(tax + "円");
console.log("合計");
console.log(total + "円");

console.log("問４");
let testScore = 101;
if(0 <= testScore && testScore < 80){
    console.log("追試です");
} else if (80 <= testScore && testScore <= 100){
    console.log("合格です");
} else {
    console.log("存在しない点数です");
}

console.log("問５");
let sum = 0;
for(let i = 1; i <= 100; i++){
    sum += i;
}
console.log(sum);

console.log("問６");
let numA = 5;
let numB = 3;
function add(numA, numB) {
    return numA + numB;
}
function sub(numA, numB) {
    return numA - numB;
}
function multi(numA, numB) {
    return numA * numB;
}
function div(numA, numB) {
    return numA / numB;
}
console.log(numA + " + " + numB + " = " + add(numA, numB));
console.log(numA + " - " + numB + " = " + sub(numA, numB));
console.log(numA + " * " + numB + " = " + multi(numA, numB));
console.log(numA + " / " + numB + " = " + div(numA, numB));
