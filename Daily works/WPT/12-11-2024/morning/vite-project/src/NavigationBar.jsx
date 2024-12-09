import { Link } from "react-router-dom";
import { ROUTES } from "./constants/RouteConstants.js";


export function NavigationBar(){
    return (
        <div>
            <div><Link to={ROUTES.HOME}>Home</Link></div>
            <div><Link to={ROUTES.ABOUT}>About</Link></div>
            <div><Link to={ROUTES.CONTACT}>Contact</Link></div>
        </div>
    )
}