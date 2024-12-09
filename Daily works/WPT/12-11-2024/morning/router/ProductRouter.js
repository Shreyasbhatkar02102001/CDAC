import { Router } from "express";
import { deleteProduct, getAllProducts, saveProduct, updateProduct } from "../controller/ProductController.js";

const productRouter = Router();

productRouter.post("/save",saveProduct);
productRouter.get("/getAll",getAllProducts);
productRouter.delete('/delete/:id',deleteProduct); 
productRouter.put('/update/:id', updateProduct); 

export default productRouter;