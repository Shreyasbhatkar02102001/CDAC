import { useLocation } from "react-router-dom";
import { ROUTES } from "../constants/RouteConstants";
import { NavigationBar } from "./NavigationBar";

export function Layout(props) {
    const location = useLocation();
    const isLoginScreenActive = location.pathname === ROUTES.LOGIN;
    return (
        <div>
            {
                !isLoginScreenActive && <NavigationBar/>
            }
            {props.children}

        </div>
    )
}