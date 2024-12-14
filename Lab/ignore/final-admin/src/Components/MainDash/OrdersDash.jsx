import React from 'react'
import './MainDash.css';
import OrderTable from '../tables/OrdersTable';
import { TableData } from '../Data/TableDetails';

const OrdersDash = () => {
  return (
    <div className="MainDash">
      <span><h1>Order's Table</h1></span>
      <OrderTable TableData={TableData.orders } />
    </div>
  )
}

export default OrdersDash