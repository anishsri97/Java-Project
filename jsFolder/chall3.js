'use strict;'


const bill = [30,50,300,100,150];

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