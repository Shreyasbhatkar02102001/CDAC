import { Router } from "express";
import { adminLogin,  registerAdmin } from "../controller/AdminController.js";

const adminRouter = Router();

adminRouter.post("/register",registerAdmin);
adminRouter.post("/login",adminLogin);

export default adminRouter;