// import React from 'react';
// import 'bootstrap-icons/font/bootstrap-icons.css'; // Make sure Bootstrap Icons are imported
// import './Sidebar.css';

// function Sidebar() {
//     return (
//         <div className='bg-white sidebar p-2'>
//             {/* <div className='m-2 d-flex align-items-center'>
//                 <i className='bi bi-bootstrap-fill me-2 fs-4'></i>
//                 <span className='brand-name fs-4'>Admin</span>
//             </div> */}
//             <hr className='text-dark' />
//             <div className='list-group list-group-flush'>
//                 <a href="#dashboard" className='list-group-item list-group-item-action py-2'>
//                     <i className='bi bi-speedometer2 fs-5 me-3'></i>
//                     <span className='fs-5'>Dashboard</span>
//                 </a>
//                 <a href="#home" className='list-group-item list-group-item-action py-2'>
//                     <i className='bi bi-house fs-5 me-3'></i>
//                     <span className='fs-5'>Home</span>
//                 </a>
//                 <a href="#chefs" className='list-group-item list-group-item-action py-2'>
//                     <i className='bi bi-people fs-5 me-3'></i>
//                     <span className='fs-5'>Chefs</span>
//                 </a>
//                 <a href="#customers" className='list-group-item list-group-item-action py-2'>
//                     <i className='bi bi-people fs-5 me-3'></i>
//                     <span className='fs-5'>Customers</span>
//                 </a>
//                 <a href="#reports" className='list-group-item list-group-item-action py-2'>
//                     <i className='bi bi-clipboard-data fs-5 me-3'></i>
//                     <span className='fs-5'>Reports</span>
//                 </a>
//                 <a href="#logout" className='list-group-item list-group-item-action py-2'>
//                     <i className='bi bi-power fs-5 me-3'></i>
//                     <span className='fs-5'>Logout</span>
//                 </a>
//             </div>
//         </div>
//     );
// }

// export default Sidebar;

import React from 'react';
import 'bootstrap-icons/font/bootstrap-icons.css'; // Make sure Bootstrap Icons are imported
import './Sidebar.css';

function Sidebar({ onSectionChange }) {
    return (
        <div className='bg-white sidebar p-2'>
            <hr className='text-dark' />
            <div className='list-group list-group-flush'>
                <a
                    href="#dashboard"
                    className='list-group-item list-group-item-action py-2'
                    onClick={() => onSectionChange('dashboard')}
                >
                    <i className='bi bi-speedometer2 fs-5 me-3'></i>
                    <span className='fs-5'>Dashboard</span>
                </a>
                <a
                    href="#home"
                    className='list-group-item list-group-item-action py-2'
                    onClick={() => onSectionChange('home')}
                >
                    <i className='bi bi-house fs-5 me-3'></i>
                    <span className='fs-5'>Home</span>
                </a>
                <a
                    href="#chefs"
                    className='list-group-item list-group-item-action py-2'
                    onClick={() => onSectionChange('chefs')}
                >
                    <i className='bi bi-people fs-5 me-3'></i>
                    <span className='fs-5'>Chefs</span>
                </a>
                <a
                    href="#customers"
                    className='list-group-item list-group-item-action py-2'
                    onClick={() => onSectionChange('customers')}
                >
                    <i className='bi bi-people fs-5 me-3'></i>
                    <span className='fs-5'>Customers</span>
                </a>
                <a
                    href="#reports"
                    className='list-group-item list-group-item-action py-2'
                    onClick={() => onSectionChange('reports')}
                >
                    <i className='bi bi-clipboard-data fs-5 me-3'></i>
                    <span className='fs-5'>Reports</span>
                </a>
                <a
                    href="#logout"
                    className='list-group-item list-group-item-action py-2'
                    onClick={() => onSectionChange('logout')}
                >
                    <i className='bi bi-power fs-5 me-3'></i>
                    <span className='fs-5'>Logout</span>
                </a>
            </div>
        </div>
    );
}

export default Sidebar;

