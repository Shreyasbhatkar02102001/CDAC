import express from 'express';
import { establishConnection } from './src/config/Dbconfig.js';
import productRouter from './src/router/ProductRouter.js';
import adminRouter from './src/router/AdminRouter.js';
import { verifyToken } from './src/middleware/VerifyToken.js';



const app = express();
app.use(express.json());
app.use('/product', verifyToken,  productRouter);
app.use("/admin", verifyToken, adminRouter);

app.listen(9800, () => {
    console.log('Server is running on port  9800 ');
    establishConnection();
});