let johnMass = 98;
let johnHeight=1.95;
let markMass= 78;
let markheight=1.69;

let markBMI = markMass/(markheight**2);
let johnBMI = johnMass/(johnHeight**2);

let markHigherBMI = markBMI>johnBMI;

if(markBMI>johnBMI)console.log(`Mark's BMI is higher than the john`);
else if(johnBMI>markBMI)console.log(`john's BMI is higer than the john`);
else console.log(`Both have the sme BMI`); 

let a = 10,b=20,c=30;
let avg = (a+b+c)/7;
console.log(`average = ${avg}`);

//const p = require('p');
//console.log(p);

var k="Anish srivastava";
for(var i=0;i<k.length;i++)
{
    console.log(k[i]);
}