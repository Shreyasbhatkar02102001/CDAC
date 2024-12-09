import { Route, Routes } from "react-router-dom";
import { ROUTES } from "../constants/RouteConstants";
import { Home } from "./Home";
import { ProductForm } from "./ProductForm";
import { ProductsList } from "./ProductsList";
import { ProductEditForm } from "./ProductEditForm";
import { Login } from "./Login";
import { PrivateRoute } from "./PrivateRoute";

export function AppRouter() {
    return (
        <Routes>
            <Route path={ROUTES.LOGIN} element={<Login />}></Route>
            <Route element={<PrivateRoute/>}>
                <Route path={ROUTES.HOME} element={<Home />}></Route>
                <Route path={ROUTES.ADD_PRODUCT} element={<ProductForm />}></Route>
                <Route path={ROUTES.PRODUCTS_LIST} element={<ProductsList />}></Route>
                <Route path={`${ROUTES.EDIT_PRODUCT}/:id`} element={<ProductEditForm />}></Route>
            </Route>

        </Routes>
    )
}