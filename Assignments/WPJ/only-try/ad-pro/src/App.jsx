// import 'bootstrap/dist/css/bootstrap.min.css';
// import 'bootstrap-icons/font/bootstrap-icons.css';
// import './App.css';
// import Sidebar from './Components/Sidebar';
// import AdminBase from './Components/AdminBase';

// function App() {
//   return (
//     <div className="container-fluid bg-secondary min-vh-100">
//       <div className="row">
//         {/* Sidebar */}
//         {/* <div className="col-2 bg-white vh-100">
//           <Sidebar />
//         </div> */}

//         {/* Main content area */}
//         <div className="col-10">
//           <AdminBase />
//         </div>
//       </div>
//     </div>
//   );
// }

// export default App;

import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import './App.css';
import Sidebar from './Components/Sidebar';
import AdminBase from './Components/AdminBase';
import CustomerTable from './Components/customerTable'; // Import the CustomerTable component

function App() {
  // State to track the currently active section
  const [activeSection, setActiveSection] = useState('dashboard');

  // Function to handle sidebar link clicks
  const handleSectionChange = (section) => {
    setActiveSection(section);
  };

  return (
    <div className="container-fluid bg-secondary min-vh-100">
      <div className="row">
        <div className="col-2 bg-white vh-100">
          <Sidebar onSectionChange={handleSectionChange} /> {/* Pass handler to Sidebar */}
        </div>
        <div className="col-10">
          <AdminBase />

          {/* Conditional rendering based on active section */}
          <div className="container mt-3">
            {activeSection === 'dashboard' && <h2>Dashboard</h2>}
            {activeSection === 'home' && <h2>Home Content</h2>}
            {activeSection === 'chefs' && <h2>Chefs List</h2>}
            {activeSection === 'customers' && <CustomerTable />} {/* Load CustomerTable */}
            {activeSection === 'reports' && <h2>Reports Section</h2>}
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;

