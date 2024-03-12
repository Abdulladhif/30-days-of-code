'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    const n = parseInt(readLine().trim(), 10);
    //covert the number to binary
    let binary = n.toString(2);
    //split the binary number by 0
    let binaryArray = binary.split('0');
    let max = 0;
    for(let s of binaryArray){
        if(s.length > max){
            max = s.length;
        }
    }
    console.log(max);

}
