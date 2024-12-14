import React, { useState } from "react";
import { NavLink } from "react-router-dom"; // Import NavLink for routing
import "./Sidebar.css";
// import Logo from "../../Imgs/logo.png";
import { SidebarDateFormat } from "../Data/Data";
import { UilSignOutAlt } from "@iconscout/react-unicons";

const Sidebar = () => {
  const [selected, setSelected] = useState(0);

  return (
    <div className="Sidebar">
      {/* Logo */}
      <div className="logo">
        {/* <img src={Logo} alt="" /> */}
        <span>
          <span>Admin</span>
        </span>
      </div>

      {/* Menu */}
      <div className="menu">
        {SidebarDateFormat.map((item, index) => (
          <NavLink
            to={`/${item.heading.toLowerCase()}`}
            key={index}
            className={({ isActive }) =>
              isActive ? "menuItem active" : "menuItem"
            }
            onClick={() => setSelected(index)}
          >
            <item.icon />
            <span>{item.heading}</span>
          </NavLink>
        ))}

        
        <NavLink
          to="/logout"
          className={({ isActive }) =>
            isActive ? "menuItem active" : "menuItem"
          }
        >
          <UilSignOutAlt />
          <span>Sign Out</span>
        </NavLink>
          

      </div>
    </div>
  );
};

export default Sidebar;
