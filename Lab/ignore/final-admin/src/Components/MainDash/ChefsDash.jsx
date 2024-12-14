import React from 'react';
import './MainDash.css';
import ChefTable from '../tables/ChefsTable';
import { TableData } from '../Data/TableDetails';

const ChefsDash = () => {
  return (
    <div className="MainDash">
      <span><h1>Chef's Table</h1></span>
      <ChefTable TableData={TableData.chefs } />
    </div>
  )
}

export default ChefsDash