const fs = require('fs');

// fs.writeFile("message.txt", "Hello Exchange", (err) => {
//     if (err) {
//         console.error("Error writing to file:", err);
//         return;
//     }
//     console.log("The file has been successfully written.");
// });

fs.readFile("message.txt", "utf-8", (err,data) => {
    if (err) throw err;
    console.log(data);
    console.log("The file has been successfully read");
});