import React from 'react'
import './MainDash.css';
import Cards from '../Card/Card';
// import BasicTable from '../tables/tables';
import CustomerTable from '../tables/CustomersTable';
import { TableData } from '../Data/TableDetails';


const MainDash = () => {
  return (
    <div className="MainDash">
      <span><h1>DashBoard</h1></span>
      <Cards/>
      {/* <BasicTable/> */}
      <CustomerTable TableData={TableData.customers } />
    </div>
  )
}

export default MainDash