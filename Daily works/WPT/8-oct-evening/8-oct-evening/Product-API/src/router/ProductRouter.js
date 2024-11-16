import { Router } from "express";
import { getAllProducts, saveProduct } from "../controller/ProductController.js";
import { verifyToken } from "../middleware/VerifyToken.js";

const productRouter = Router();

productRouter.post("/save",verifyToken,saveProduct);
productRouter.get("/getAll",verifyToken,getAllProducts);

export default productRouter;