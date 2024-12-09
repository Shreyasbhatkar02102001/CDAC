import React from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';

function NavAdminExample({ onToggleSidebar }) {
  return (
    <Navbar
      expand="sm"
      bg="white"
      variant="light"
      className="mb-4 shadow-sm w-100"
      // style={{ width: '100%', position: 'fixed', top: 0, left: 0, zIndex: 1030 }}
    >
      <Container fluid>
        {/* Navbar Brand / Menu Icon */}
        <Navbar.Brand onClick={onToggleSidebar} style={{ cursor: 'pointer' }}>
          <i className="bi bi-justify-left fs-4"></i>
        </Navbar.Brand>

        {/* Toggler for small screens */}
        <Navbar.Toggle aria-controls="navbar-nav" />

        {/* Collapsible content */}
        <Navbar.Collapse id="navbar-nav">
          <Nav className="ms-auto">
            {/* Dropdown Menu */}
            <NavDropdown
              title={
                <span>
                  <i className="bi bi-person-circle me-2"></i> Admin Name
                </span>
              }
              id="profile-dropdown"
              align="end"
            >
              <NavDropdown.Item href="#profile">Profile</NavDropdown.Item>
              <NavDropdown.Item href="#settings">Settings</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#logout">Logout</NavDropdown.Item>
            </NavDropdown>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default NavAdminExample;
