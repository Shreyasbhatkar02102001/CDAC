import React from 'react'
import CustomNavbar from '../Navbar'
import CarouselAdminLogin from '../CarouselAdminLogin'
import SignIn from '../FormLogin'
import Lfooter from '../FooterCom'

function Sadmin() {   //  Login example
  
    return (
      <div>
        <div>
          <CustomNavbar />
        </div>
        <div>
          <CarouselAdminLogin/>
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
  
  export default Sadmin