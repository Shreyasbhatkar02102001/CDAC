// import Container from 'react-bootstrap/Container';
// import Nav from 'react-bootstrap/Nav';
// import Navbar from 'react-bootstrap/Navbar';
// import NavDropdown from 'react-bootstrap/NavDropdown';

// function BasicExample() {
//   return (
//     <Navbar expand="lg" className="bg-body-tertiary">
//       <Container>
//         <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
//         <Navbar.Toggle aria-controls="basic-navbar-nav" />
//         <Navbar.Collapse id="basic-navbar-nav">
//           <Nav className="me-auto">
//             <Nav.Link href="#home">Home</Nav.Link>
//             <Nav.Link href="#link">Link</Nav.Link>
//             <NavDropdown title="Dropdown" id="basic-nav-dropdown">
//               <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
//               <NavDropdown.Item href="#action/3.2">
//                 Another action
//               </NavDropdown.Item>
//               <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
//               <NavDropdown.Divider />
//               <NavDropdown.Item href="#action/3.4">
//                 Separated link
//               </NavDropdown.Item>
//             </NavDropdown>
//           </Nav>
//         </Navbar.Collapse>
//       </Container>
//     </Navbar>
//   );
// }

// export default BasicExample;


import React from 'react';
import { Navbar, Nav, NavDropdown, Container } from 'react-bootstrap';
import './Navbar.css'

function CustomNavbar() {
  return (
    <Navbar expand="lg" bg="light">
      <Container>
        <Navbar.Brand href="/" className="d-flex align-items-center">
          <img
            src="https://static.vecteezy.com/system/resources/thumbnails/008/212/813/small/cooking-logo-design-vector.jpg"
            alt="Logo"
            width="30"
            height="30"
            className="d-inline-block align-top"
          />
          <span className="ms-2">Namaste</span>
        </Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarNav" />
        <Navbar.Collapse id="navbarNav" className="justify-content-end">
          <Nav>
            <Nav.Link className='navlink' href="/" active>
              Home
            </Nav.Link>
            <Nav.Link className='navlink' href="/">About Us</Nav.Link>
            <Nav.Link className='navlink' href="/">Contact Us</Nav.Link>
            <NavDropdown className='navlink' title="Sign In" id="navbarDropdown">
              <NavDropdown.Item href="/">As Customer</NavDropdown.Item>
              <NavDropdown.Item href="/">As Chef</NavDropdown.Item>
              <NavDropdown.Item href="/">As Admin</NavDropdown.Item>
            </NavDropdown>
            <NavDropdown className='navlink' title="Sign Up" id="navbarDropdown">
              <NavDropdown.Item href="/">As Customer</NavDropdown.Item>
              <NavDropdown.Item href="/">As Chef</NavDropdown.Item>
              <NavDropdown.Item href="/">As Admin</NavDropdown.Item>
            </NavDropdown>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default CustomNavbar;
