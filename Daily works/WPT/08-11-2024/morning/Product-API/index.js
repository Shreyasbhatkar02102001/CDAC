import express from 'express';
import { establishConnection } from './src/config/DbConfig.js';
import productRouter from './src/router/ProductRouter.js';

const app = express();
app.use(express.json());
app.use("/products",productRouter);

app.listen(9800,()=>{
    console.log('Server is running on port 9800');
    establishConnection();
});