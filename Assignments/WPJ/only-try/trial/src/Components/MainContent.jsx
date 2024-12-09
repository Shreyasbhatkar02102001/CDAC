import React from 'react';
import { Form, Button, Table } from 'react-bootstrap';

const MainContent = () => {
  return (
    <div style={{ padding: '20px' }}>
      <h2>Menu Management</h2>
      <Form>
        <Form.Group className="mb-3" controlId="dishName">
          <Form.Label>Dish Name</Form.Label>
          <Form.Control type="text" placeholder="Enter dish name" />
        </Form.Group>
        <Form.Group className="mb-3" controlId="description">
          <Form.Label>Description</Form.Label>
          <Form.Control type="text" placeholder="Enter dish description" />
        </Form.Group>
        <Form.Group className="mb-3" controlId="price">
          <Form.Label>Price</Form.Label>
          <Form.Control type="number" placeholder="Enter dish price" />
        </Form.Group>
        <Button variant="primary" type="submit">
          Add New Dish
        </Button>
      </Form>
      <Table striped bordered hover className="mt-4">
        <thead>
          <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {/* Rows will go here */}
        </tbody>
      </Table>
    </div>
  );
};

export default MainContent;
