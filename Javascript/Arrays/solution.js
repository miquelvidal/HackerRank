'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    let segonInt = nums[0];
    let primerInt = nums[0];
    var fruits, text, fLen, i;
    
    fLen = nums.length;

    for (i = 0; i < fLen; i++) {
        if (nums[i]==primerInt) continue;
        if (nums[i]>=primerInt){
            if (nums[i]>primerInt){
                segonInt = primerInt;
                primerInt = nums[i];
            }
            
            continue;
        }
        if (nums[i]>segonInt) segonInt=nums[i];
    }
    return segonInt;
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
