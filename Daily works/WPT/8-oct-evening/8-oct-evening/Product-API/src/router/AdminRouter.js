import { Router } from "express";
import { adminLogin, registerAdmin } from "../controller/AdminController.js";
import { verifyToken } from "../middleware/VerifyToken.js";

const adminRouter = Router();

adminRouter.post("/register",verifyToken,registerAdmin);
adminRouter.post("/login",adminLogin);

export default adminRouter;