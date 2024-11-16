// import { error } from 'console';
import express from 'express';
// import { createConnection } from 'mysql'; // Use mysql library for MySQL connections
import { establishConnection } from './src/config/Dbconfig.js';
import { saveEmployee } from './src/controllers/EmployeeController.js';
import employeeRouter from './src/router/EmployeeRouter.js';

const PORT = 9600;
const app = express();
app.use(express.json()); 

app.use("/employee",employeeRouter)

// app.get("/", (request, response) => {
//     response.send({ message: "Welcome to Employee CRUD API" });
// });


app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    establishConnection();
});
