import { useEffect, useState } from "react";
import { Alert, Button, Container, Modal, Table } from "react-bootstrap";
import { getAllProducts, removeProduct } from "../services/ProductsService";
import { ToastContainer, toast } from 'react-toastify';
import { useNavigate } from "react-router-dom";
import { ROUTES } from "../constants/RouteConstants";

export function ProductsList() {

    const [products, setProducts] = useState([]);
    const [showModal, setShowModal] = useState(false);
    const [selectedProductId, setSelectedProductId] = useState(0);

    const navigate = useNavigate();

    const getProductsData = async () => {
        try {
            const response = await getAllProducts();
            setProducts(response.data);
        } catch (error) {
            console.log(error);
        }
    }

    const openModal = () => {
        setShowModal(true);
    }

    const closeModal = () => {
        setShowModal(false);
    }

    const handleProductDelete = async () => {
        try {
            const response = await removeProduct(selectedProductId);
            if(response.status === 200){
                toast.success(response.data.message);
                getProductsData();
            }
        } catch (error) {
            console.log(error);
            toast.error(response.data.message);
        }
        finally{
            closeModal();
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
                            products.map((product) => {
                                return (
                                    <tr>
                                        <td>{product.id}</td>
                                        <td>{product.name}</td>
                                        <td>{product.price}</td>
                                        <td>{product.description}</td>
                                        <td>{product.quantity}</td>
                                        <td>
                                            <Button variant="danger" size="sm" onClick={() => {
                                                setSelectedProductId(product.id);
                                                openModal();

                                            }}>Delete</Button> 
                                             <Button variant="primary" size="sm" onClick={()=>{
                                                navigate(`${ROUTES.EDIT_PRODUCT}/${product.id}`);
                                             }}>Edit</Button>
                                        </td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </Table>
            </Container>
            <Modal show={showModal} onHide={closeModal}>
                <Modal.Header closeButton>
                    <Modal.Title>Confirmation</Modal.Title>
                </Modal.Header>
                <Modal.Body>Are you sure, you want to remove {selectedProductId} ?</Modal.Body>
                <Modal.Footer>
                    <Button variant="success" onClick={handleProductDelete}>
                        Yes
                    </Button>
                    <Button variant="danger" onClick={closeModal}>
                        No
                    </Button>
                </Modal.Footer>
            </Modal>
            <ToastContainer />
        </Container>
    )
}