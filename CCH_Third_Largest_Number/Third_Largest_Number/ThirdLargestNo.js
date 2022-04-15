// code to install npm
// npm install prompt -sync

const prompt = require('prompt-sync')();

let str1 = prompt('enter the sequence numbers (give space between numbers) :');

let arrStr = str1.split(",");

for (let a = 0; a < arrStr.length; a++) {
    arrStr[a] = parseInt(arrStr[a]);   
}

let sortedArray =bubbleSort(arrStr);

// output the sorted array in console

for (var p=0;p<sortedArray.length;p++){
    console.log("arr: " + p +":"+  sortedArray[p]);
}

// print the 3rd largest number from sorted array

console.log("The Third largest number is : " + sortedArray[2]);

// sort the unsorted array

function bubbleSort(arrStr){
     
    for(var i = 0; i < arrStr.length; i++){   
      for(var j = 0; j < ( arrStr.length - i -1 ); j++){  
        if(arrStr[j] > arrStr[j+1]){
          var temp = arrStr[j]
          arrStr[j] = arrStr[j + 1]
          arrStr[j+1] = temp
        }
      }
    }
    return arrStr
  }