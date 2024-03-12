function processData(input) {
    //Enter your code here
    input = input.split('\n');
    var n = parseInt(input[0]);
    for(var i = 1; i <= n; i++){
        var str = input[i];
        var even = '';
        var odd = '';
        for(var j = 0; j < str.length; j++){
            if(j % 2 === 0){
                even += str[j];
            } else {
                odd += str[j];
            }
        }
        console.log(even + ' ' + odd);
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
