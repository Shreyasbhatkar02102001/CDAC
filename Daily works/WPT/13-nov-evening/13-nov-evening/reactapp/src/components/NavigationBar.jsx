import { Button, Container, Nav, Navbar } from "react-bootstrap";
import { ROUTES } from "../constants/RouteConstants";
import { LinkContainer } from "react-router-bootstrap";
import { useNavigate } from "react-router-dom";
import { removeToken } from "../services/AdminService";

export function NavigationBar(){

    const navigate = useNavigate();
    const handleLogout = ()=>{
        removeToken();
        navigate(ROUTES.LOGIN);
    }

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
          <Button variant="success" onClick={handleLogout}>Logout</Button>
        </Container>
      </Navbar> 
    )
}