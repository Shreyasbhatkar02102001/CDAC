import { useState } from "react";
import { Alert, Button, Col, Container, FloatingLabel, Form, Row } from "react-bootstrap";
import { saveProduct } from "../services/ProductsService";
import { ToastContainer, toast } from 'react-toastify';
import { useSelector } from "react-redux";

export function ProductForm() {
    const score = useSelector(state=>state.scoreReducer.score);
    const [formData,setFormData]=useState({id:"", name:"", description:"", quantity:"", price:""});
    
    const handleInputChange = (e)=>{
        setFormData({
            ...formData,
            [e.target.name]:e.target.value
        });
    }

    const handleSubmit = async ()=>{
        try {
            console.log(formData);
            const response = await saveProduct(formData);
            console.log(response);
            toast.success(response.data.message)
        } catch (error) {
           toast.error(response.data.message)
           console.log(error); 
        }
        
    }

    return (
        <Container className="mt-4">
            <Alert variant="success">
                Add a new product here and score is {score}
            </Alert>
            <Container>
                <Row>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="id"
                            label="Enter Id"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Id" name="id" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="name"
                            label="Enter Name"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Name" name="name" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                </Row>
                <Row>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="price"
                            label="Enter Price"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Price" name="price" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="description"
                            label="Enter Description"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Description" name="description" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                </Row>
                <Row>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="quantity"
                            label="Enter Quantity"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Quantity" name="quantity" onChange={handleInputChange} />
                        </FloatingLabel>
                    </Col>
                </Row>
                <Button variant="primary" onClick={handleSubmit}>Add Product</Button>
            </Container>
            <ToastContainer/>
        </Container>
    )
}