// App.jsx or Routes.jsx
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import { Container, Row, Col } from 'react-bootstrap';
import Sidebar from './Components/Sidebar/Sidebar';  // Sidebar component
import MainDash from './Components/MainDash/MainDash';
import OrdersTable from './Components/tables/OrdersTable';
import CustomersTable from './Components/tables/CustomersTable';
import ChefsTable from './Components/tables/ChefsTable';
import MenuTable from './Components/tables/MenuTable';
import './App.css';  // Make sure to create this file if you don't have it

const App = () => {
  return (
    <Router>
      <Container fluid className="full-height">
        <Row className="full-height">
          <Col md={3} className="fixed-height bg-dark">
            <Sidebar /> {/* Sidebar component */}
          </Col>
          <Col md={9} className="content flex-grow-1 bg-light">
            <Routes>
              <Route path="/" element={<MainDash />} />
              <Route path="/orders" element={<OrdersTable />} />
              <Route path="/customers" element={<CustomersTable />} />
              <Route path="/chefs" element={<ChefsTable />} />
              <Route path="/menu" element={<MenuTable />} />
            </Routes>
          </Col>
        </Row>
      </Container>
    </Router>
  );
};

export default App;
