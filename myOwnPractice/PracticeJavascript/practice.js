/*let r = [1,3,5,7];
for(i=0; i < r.length;i=i+2){
    console.log(r[i])
}
let animals = ['koal','pand','zebr'];
for(i = 0; i < animals.length; i++) {
  console.log(animals[i]+'a');
}
let t = [1,2,3,4,5];
console.log(t[2]+1)

let s = [1,2,3,8,5,6];
for(i = 0; i < s.length; i++) {
  if(s[i]===8) {
    s[i] = 4;
  }
}
console.log(s)
myFunction(r);
console.log(myFunction(r))
function myFunction(r) {
  return(r[0]+r[1]);
}*/


let goButton = document.querySelector(".go")
let result = document.getElementById("result")  
let number1 = document.getElementById("number1");
let number2 = document.getElementById("number2");
let operation = document.getElementById("operation");

goButton.addEventListener('click', liverfunction)
function liverfunction() {
   // let output = parseInt(number1.value) + operation.value + parseInt(number2.value)
   let num1 =  parseInt(number1.value)
   let num2 =  parseInt(number2.value)
   let output = `${num1} ${operation.value} ${num2}`
    result.innerText = eval(output);
}
