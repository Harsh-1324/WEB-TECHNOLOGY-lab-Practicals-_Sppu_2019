function calculate(op){
let a = parseFloat(prompt("Enter first number"));
let b = parseFloat(prompt("Enter second number"));

if(isNaN(a) || isNaN(b)){
alert("Invalid input");
return;
}

let result;

if(op=="+") result = a+b;
if(op=="-") result = a-b;
if(op=="*") result = a*b;
if(op=="/") result = a/b;

alert("Result = " + result);
}