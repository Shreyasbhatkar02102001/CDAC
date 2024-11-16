import express from 'express';
import { establishConnection } from './src/config/DbConfig.js';
import employeeRouter from './src/router/EmployeeRouter.js';

const PORT = 9600;
const app = express();
app.use(express.json());

app.use("/employee",employeeRouter);

app.listen(PORT,()=>{
    console.log(`Server is running on port ${PORT}`);
    establishConnection();
});