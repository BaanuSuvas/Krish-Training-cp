const prompt = require('prompt-sync')();

let str1 = prompt('enter the first word :');
let str2 = prompt('enter the second word :');

if (str1.length === str2.length) {
    let sorted1 = sortString(str1);
    let sorted2 = sortString(str2);

    let count =0;

    for(var i=0; i < sorted1.length; i++) {
        if(sorted1.charAt(i) === sorted2.charAt(i))
        {
            count++;
        }
    }

    if(count === sorted1.length)
    {
        console.log("anagram words")
    }
    else{
        console.log("not anagram words")
    }
}
else{
    console.log("not anagram words")
}

function sortString(str){
    var arr = str.split('');
    var temp;
    for(var i = 0; i < arr.length; i++){
      for(var j = i + 1; j < arr.length; j++){  
        if(arr[i] > arr[j]){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr.join('');
  }

