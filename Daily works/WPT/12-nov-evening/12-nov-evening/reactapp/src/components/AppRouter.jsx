import { Route, Routes } from "react-router-dom";
import { ROUTES } from "../constants/RouteConstants";
import { Home } from "./Home";
import { ProductForm } from "./ProductForm";
import { ProductsList } from "./ProductsList";

export function AppRouter(){
    return (
        <Routes>
            <Route path={ROUTES.HOME} element={<Home/>}></Route>
            <Route path={ROUTES.ADD_PRODUCT} element={<ProductForm/>}></Route>
            <Route path={ROUTES.PRODUCTS_LIST} element={<ProductsList/>}></Route>
        </Routes>
    )
}