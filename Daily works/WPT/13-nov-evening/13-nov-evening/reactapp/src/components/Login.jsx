import { useEffect, useState } from "react";
import { Alert, Button, Col, Container, FloatingLabel, Form, Row } from "react-bootstrap";
import { getToken, login, storeToken } from "../services/AdminService";
import { ToastContainer, toast } from 'react-toastify';
import { useNavigate } from "react-router-dom";
import { ROUTES } from "../constants/RouteConstants";

export function Login() {

    const [formData, setFormData] = useState({username:"",password:""});
    const navigate = useNavigate();

    useEffect(()=>{
        if(getToken()){
            navigate(ROUTES.HOME);
        }
    },[])

    const handleInputChange = (event) =>{
        setFormData({
            ...formData, 
            [event.target.name]: event.target.value
        });
    }

    const handleLogin = async(event) => {
        try {
            const response = await login(formData);
            console.log(response);
            if(response.status === 200) {
                storeToken(response.data.token);
                navigate(ROUTES.HOME);
            }
        } catch (error) {
            console.log(error)
            if(error.response.status === 400){
                toast.error(error.response.data.message);
            }
        }
    }

    return (
        <Container className="mt-5">
            <Alert variant="primary">
                Admin Login
            </Alert>
            <Container>
                <Row>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="username"
                            label="Enter Username"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Username" name="username" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                </Row>
                <Row>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="password"
                            label="Enter Password"
                            className="mb-3"
                        >
                            <Form.Control type="password" placeholder="Enter Password" name="password" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                </Row>
                <Button variant="success" onClick={handleLogin}>Login</Button>
            </Container>
            <ToastContainer/>
        </Container>
    )
}