function processData(input) {
    //Enter your code here
    input = input.split('\n');
    const n = parseInt(input[0]);
    const phoneBook = {};
    for (let i = 0; i < n; i++) {
        const contact = input[i+1].split(' ');
        phoneBook[contact[0]] = contact[1];
    }
    for (let i = n+1; i < input.length; i++) {
        if (phoneBook[input[i]]) {
            console.log(input[i] + '=' + phoneBook[input[i]]);
        } else {
            console.log('Not found');
        }
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
