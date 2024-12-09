import React, { useState } from "react";
import { Nav } from "react-bootstrap";
import { Link } from "react-router-dom";  // Import Link from react-router-dom
import { SidebarDateFormat } from "../Data/Data";  // Import Sidebar data

const Sidebar = () => {
  const [activeLink, setActiveLink] = useState("Dashboard"); // Default active link is Dashboard

  // Handle the active link change
  const handleLinkClick = (heading) => {
    setActiveLink(heading);
    if (heading === "Sign-Out") {
      console.log("User signed out");
      // Implement sign-out logic here (e.g., clear session, redirect to login)
    }
  };

  return (
    <div className="d-flex sidebar flex-column flex-shrink-0 bg-dark" style={{ width: "250px" }}>
      <Nav className="flex-column mb-auto px-0 mt-3">
        {SidebarDateFormat.map((item, index) => (
          <Nav.Item key={index}>
            <Link
              to={item.heading === "Dashboard" ? "/" : `/${item.heading.toLowerCase()}`}
              className={`text-white nav-link ${activeLink === item.heading ? "active" : ""}`}
              onClick={() => handleLinkClick(item.heading)}
            >
              <item.icon size={24} />
              <span className="ms-2">{item.heading}</span>
            </Link>
          </Nav.Item>
        ))}
      </Nav>
    </div>
  );
};

export default Sidebar;
