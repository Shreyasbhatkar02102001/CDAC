import React, { useState } from 'react';
import NavAdminExample from './NavAdmin';
import Sidebar from './Sidebar';
import Offcanvas from 'react-bootstrap/Offcanvas';

function AdminBase() {
  // State to control sidebar visibility
  const [showSidebar, setShowSidebar] = useState(false);

  // Toggle sidebar visibility
  const handleSidebarToggle = () => setShowSidebar(!showSidebar);
  const handleSidebarClose = () => setShowSidebar(false);

  return (
    <div>
      {/* Pass the toggle function to NavAdminExample */}
      <NavAdminExample onToggleSidebar={handleSidebarToggle} />

      {/* Offcanvas Sidebar */}
      <Offcanvas show={showSidebar} onHide={handleSidebarClose} backdrop={true}>
        <Offcanvas.Header closeButton>
          <Offcanvas.Title>Menu</Offcanvas.Title>
        </Offcanvas.Header>
        <Offcanvas.Body>
          <Sidebar />
        </Offcanvas.Body>
      </Offcanvas>

      {/* Main content can go here */}
      <div className="container mt-3">
        <h2>Welcome to the Admin Dashboard</h2>
        {/* Additional content here */}
      </div>
    </div>
  );
}

export default AdminBase;
