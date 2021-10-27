'use strict';

const avg = (run1,run2,run3)=>
{
    return (run1+run2+run3)/3;
}

const winner = (AvgTeam1,AvgTeam2)=>
{
      if(AvgTeam1>=(AvgTeam2*2))
      {
          return `Team one is winner ${AvgTeam1} : ${AvgTeam2} .`;
      }
      else if(AvgTeam2>=(AvgTeam1*2))
      {
          return `Team 2 is winner  ${AvgTeam2}:${AvgTeam1}`;
      }
      else{
          return `no team wins!`;
      }
}

const teamOne = avg(85,54,41);
const teamTwo = avg(23,34,27);

console.log(winner(teamOne,teamTwo));
