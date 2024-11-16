import { Router } from "express";
import { getAllProducts, saveProduct } from "../controller/ProductController.js";

const productRouter = Router();

productRouter.post("/save",saveProduct);
productRouter.get("/getAll",getAllProducts);

export default productRouter;