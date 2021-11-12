'use strict';

var currentYear = 2021;


console.log(currentYear);



function getAge(currentYear)
{
    return 2021-currentYear;
}

console.log(getAge(currentYear));



var age = function(currentYear)
{
    return 2021-currentYear;
}

console.log(age(2035));

//Arrow function

var nage = (currentYear)=>
{
   return 2021-currentYear;
}

console.log(`arrow function age = ${nage(2050)}`);

var name="Anish";
var n="";
for(var x=name.length-1;x>=0;x--)
{
    n+=name[x];
}
console.log(n);

