import { Route, Routes } from "react-router-dom";
import { Home } from "./Home";
import { About } from "./About";
import { Contact } from "./Contact";
import { ROUTES } from "./constants/RouteConstants";

export function AppRouter(){
    return (
        <Routes>
          <Route path={ROUTES.HOME} element={<Home />}></Route>
          <Route path={ROUTES.ABOUT} element={<About />}></Route>
          <Route path={ROUTES.CONTACT} element={<Contact />}></Route>
        </Routes>
    )
}