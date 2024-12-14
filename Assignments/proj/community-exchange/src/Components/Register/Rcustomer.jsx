import React from 'react'
import CarouselCustomerRegis from '../CarouselCustomerRegis'
import Lfooter from '../FooterCom';
import FormRegister from '../FormRegister';
import CustomNavbar from '../Navbar';

function Rcustomer() {   // Resgister
  
    return (
      <div>
        <div>
          <CustomNavbar/>
        </div>
        <div>
          <CarouselCustomerRegis />
        </div>
        <div>
          <FormRegister /> 
        </div>
        <div>
          <Lfooter />
        </div>
      </div>
    )
  }

  export default Rcustomer