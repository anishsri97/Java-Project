'use strict;'


const bill = [30,50,300,100,150];

bill.push(10); /* push will add the elemnt in last position*/
console.log(`ten is pushed ${bill}`);
bill.pop();
console.log(`Popped ${bill}`); /* pop will remove the element from back*/
console.log(bill.indexOf(50)); /* indexof will check the index of element*/
console.log(bill.includes(300));  /* includes will check the element in array*/ 
bill.shift(); /* shift will remove from front*/
console.log(`shift ${bill}`);
bill.unshift(300); /* unshift will add first position*/
console.log(`unshift ${bill}`);

//Object creation in Java Script
//
const darsh=
{
   fullName:'Ashvik Srivastava',nickNmae:'Darsh',dob:'09/10/2019',hobby:'playing games'
};



//dot notaion
console.log(darsh.fullName);
//
const prop = prompt("What you know about Ashvik");
//Using expressions
console.log(darsh[prop]);


const calTip = (bill)=>
{
    const tip=[];
    for(var b=0; b<bill.length;b++)
    {
        if(bill[b]>=30 && bill[b]<=50)
        {
             let x = bill[b]+(bill[b]*15)/100;
             console.log(x);
             tip.push(x);
        }
        else
        {
            let y = bill[b]+(bill[b]*20)/100
            tip.push(y);
            console.log(y);
        }
    }
    return tip;

}
console.log(calTip(bill));