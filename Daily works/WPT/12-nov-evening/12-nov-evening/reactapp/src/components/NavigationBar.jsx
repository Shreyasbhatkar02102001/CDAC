import { Container, Nav, Navbar } from "react-bootstrap";
import { ROUTES } from "../constants/RouteConstants";
import { LinkContainer } from "react-router-bootstrap";

export function NavigationBar(){
    return (
        <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">Product App</Navbar.Brand>
          <Nav className="me-auto">
            <LinkContainer to={ROUTES.HOME}>
                <Nav.Link>Home</Nav.Link>
            </LinkContainer>
            
            <LinkContainer to={ROUTES.ADD_PRODUCT}>
                <Nav.Link>Add Product</Nav.Link>
            </LinkContainer>

            <LinkContainer to={ROUTES.PRODUCTS_LIST}>
                <Nav.Link>Products List</Nav.Link>
            </LinkContainer>
          </Nav>
        </Container>
      </Navbar> 
    )
}