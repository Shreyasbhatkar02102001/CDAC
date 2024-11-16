import express from 'express';
// import { establishConnection } from './src/config/DbConfig.js';
import productRouter from './src/router/ProductRouter.js';
import cors from 'cors';
import { establishConnection } from './src/config/Dbconfig.js';

const app = express();
// app.use(cors());
app.use(cors({
    origin: 'http://127.0.0.1:5500' // allow only this origin
}));
app.use(express.json());

app.use(express.urlencoded({ extended: true }));
app.use("/books",productRouter);

const port = 3000;




app.listen(port,()=>{
    console.log("Connected wih server..."+port);
    establishConnection();
});