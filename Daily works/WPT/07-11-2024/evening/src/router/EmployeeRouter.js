import { Router } from "express";
import { saveEmployee } from "../controllers/EmployeeController.js";


const employeeRouter = Router();

employeeRouter.post("/register", saveEmployee);

export default employeeRouter;