import React from 'react'
// import './CustomersDash.css';
import './MainDash.css';
import CustomerTable from '../tables/CustomersTable';
import { TableData } from '../Data/TableDetails';

const CustomersDash = () => {
  return (
    <div className="MainDash">
      <span><h1>Customer's Table</h1></span>
      <CustomerTable TableData={TableData.customers } />
    </div>
  )
}

export default CustomersDash