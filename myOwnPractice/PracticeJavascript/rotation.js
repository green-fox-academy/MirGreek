'use strict'

let num = 8
let list = [1, 2, 3, 4, 5]

function rotLeft (num, list) {
  let newList = []

  for(let i =0; i < list.length; i++) {
    newList.push(0)
  }

  if (num > list.length) {
    num = num-list.length
  } 

  let newIndex = list.length-num
  
  for(let j = 0; j < num; j++) {
    newList[newIndex+j] = list[0+j]
    list[0+j]=''
}

let remainders = []
for(let k = 0; k < list.length; k++) {
  if(list[k]!=='') {
   remainders.push(list[k])
  }
}

let justNumbers = []
for ( let i= 0; i< newList.length; i++) {
  if(newList[i]!== 0) {
    justNumbers.push(newList[i])
  }
}

let final =  remainders.concat(justNumbers)
console.log(final)
}
rotLeft(num, list)