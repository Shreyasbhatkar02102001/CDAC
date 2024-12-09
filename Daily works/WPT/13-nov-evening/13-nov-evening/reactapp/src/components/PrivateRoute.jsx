import { Navigate, Outlet } from "react-router-dom";
import { getToken } from "../services/AdminService";
import { ROUTES } from "../constants/RouteConstants";

export function PrivateRoute(props){
    const token = getToken();
    if(token){
        return (
            <>
                <Outlet/>
            </>
        )
    }
    else{
       return (
        <Navigate to={ROUTES.LOGIN}></Navigate>
       )
    }
}