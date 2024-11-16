// now to define the routing we are no longer needed app variable 
// express has introduced a router object 
// to get router object call Router() as a function, and it will return the router object

import { Router } from "express";
import { saveEmployee } from "../controllers/EmployeeController.js";

const employeeRouter = Router();

employeeRouter.post("/register",saveEmployee);


export default employeeRouter;