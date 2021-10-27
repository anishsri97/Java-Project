'use strict';

// function declaration

function helloMsg(name)
{
    console.log(`hello ${name} and welcome to function declaration`);
}

helloMsg("Anish Srivastava");

// function expression

var x = function(a){ return a**2;}

console.log(x(3));

// Arrow function

const arr = (a,b)=>
{
    console.log("welcome in arrow function");
    return a*b;
}

console.log(arr(2,3));

