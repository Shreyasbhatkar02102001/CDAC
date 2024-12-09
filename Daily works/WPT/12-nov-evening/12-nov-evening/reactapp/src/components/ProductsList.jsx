import { useEffect, useState } from "react";
import { Alert, Button, Container, Table } from "react-bootstrap";
import { getAllProducts } from "../services/ProductsService";

export function ProductsList() {

    const [products, setProducts] = useState([]);

    const getProductsData = async () => {
        try {
            const response = await getAllProducts();
            setProducts(response.data);
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(() => {
        getProductsData();
    }, []);
    return (
        <Container className="mt-4">
            <Alert variant="success">
                View all the products
            </Alert>
            <Container className="mt-2">
                <Table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Description</th>
                            <th>Quantity</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            products.map((product)=>{
                                return (
                                    <tr>
                                        <td>{product.id}</td>
                                        <td>{product.name}</td>
                                        <td>{product.price}</td>
                                        <td>{product.description}</td>
                                        <td>{product.quantity}</td>
                                        <td>
                                            <Button variant="danger" size="sm">Delete</Button> <Button variant="primary" size="sm">Edit</Button>
                                        </td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </Table>
            </Container>
        </Container>
    )
}