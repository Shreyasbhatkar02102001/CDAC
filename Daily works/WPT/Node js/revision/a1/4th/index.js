const fs = require('fs');

fs.writeFile("my-notes.txt","this is a note", () => {
    console.log("File created successfully");
});

console.log("after writing file");