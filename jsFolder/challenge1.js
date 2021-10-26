let johnMass = 98;
let johnHeight=1.95;
let markMass= 78;
let markheight=1.69;

let markBMI = markMass/(markheight**2);
let johnBMI = johnMass/(johnHeight**2);

let markHigherBMI = markBMI>johnBMI;

console.log(markHigherBMI);