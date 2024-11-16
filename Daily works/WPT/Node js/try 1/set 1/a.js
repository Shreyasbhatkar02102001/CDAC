//  process.stdout.write('Enter you simple equation : ');

//  console.log('Enter you simple equation: '); 

// process.stdin.on('data', (chunk) => {
//     console.log(chunk.toString().trim());
// });
process.stdin.on('data', (chunk) => {

    const input = chunk.toString().trim();

    if (input == 'quit') {
        process.exit(0);
    } 
    try {
        const value = eval(input);
        console.log('${value}');
    }
    catch (exception) {
        console;.log('Enter you equation: ');
    }
});
process.stdout.write("Enter your equation: ");

