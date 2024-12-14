import React from 'react'
import CustomNavbar from '../Navbar';
import CarouselCustomerLogin from '../CarouselCustomerLogin';
import SignIn from '../FormLogin';
import Lfooter from '../FooterCom';

function Scustomer() {
  return (
    <div>
      <div>
        <CustomNavbar/>
      </div>
      <div>
        <CarouselCustomerLogin/>
      </div>
      <div>
        <SignIn/> 
      </div>
      <div>
        <Lfooter />
      </div>
    </div>
  )
}

export default Scustomer