import { useEffect, useState } from "react";
import { Alert, Button, Col, Container, FloatingLabel, Form, Row } from "react-bootstrap";
import { useParams } from "react-router-dom";
import { getProductById } from "../services/ProductsService";

export function ProductEditForm() {

    const {
        id
    } = useParams(); // for backend request.params

    const [product, setProduct] = useState({ id: "", name: "", description: "", quantity: "", price: 0 });

    const getProductData = async () => {
        try {
            const response = await getProductById(id);
            if (response.status === 200) {
                console.log(response.data);
                setProduct(response.data);
            }
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(() => {
        getProductData();
    }, []);

    const handleInputChange = (e) => {
        setProduct({
            ...product,
            [e.target.name]:e.target.value
        })
    }

    return (
        <Container className="mt-4">
            <Alert variant="success">
                Edit the fields to pass new data
            </Alert>
            <Container>
                <Row>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="id"
                            label="Enter Id"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Id" name="id" onChange={handleInputChange} value={id} readOnly />
                        </FloatingLabel>
                    </Col>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="name"
                            label="Enter Name"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Name" name="name" onChange={handleInputChange} value={product.name} />
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
                            <Form.Control type="text" placeholder="Enter Price" name="price" onChange={handleInputChange} value={product.price} />
                        </FloatingLabel>
                    </Col>
                    <Col lg={4}>
                        <FloatingLabel
                            controlId="description"
                            label="Enter Description"
                            className="mb-3"
                        >
                            <Form.Control type="text" placeholder="Enter Description" name="description" onChange={handleInputChange} value={product.description} />
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
                            <Form.Control type="text" placeholder="Enter Quantity" name="quantity" onChange={handleInputChange} value={product.quantity} />
                        </FloatingLabel>
                    </Col>
                </Row>
                <Button variant="primary" >Update Product</Button>
            </Container>
        </Container>
    )
}