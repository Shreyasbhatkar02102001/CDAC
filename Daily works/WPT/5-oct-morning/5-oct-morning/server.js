const http = require('http');
const server = http.createServer((request,response)=>{
    response.write("Hello from server");
    response.end();
});

server.listen(4050,()=>{
    console.log("Server is running on port 4050");  // Server started on port 4050
});
