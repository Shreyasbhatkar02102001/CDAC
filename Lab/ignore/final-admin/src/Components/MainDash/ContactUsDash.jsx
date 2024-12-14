import React from 'react'
// import './CustomersDash.css';
import './MainDash.css';
import ContactUsTable from '../tables/ContactUsTable';
import { TableData } from '../Data/TableDetails';

const ContactUsDash = () => {
  return (
    <div className="MainDash">
      <span><h1>Contact Us Table</h1></span>
      <ContactUsTable TableData={TableData.inquiries } />
    </div>
  )
}

export default ContactUsDash