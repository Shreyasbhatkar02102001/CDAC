import React from 'react'
import CarouselChefRegis from '../CarouselChefRegis'
import Lfooter from '../FooterCom';
import CustomNavbar from '../Navbar';
import FormRegister from '../FormRegister';

function Rchef() {   // Resgister
  
    return (
      <div>
        <div>
          <CustomNavbar/>
        </div>
        <div>
          <CarouselChefRegis />
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

  export default Rchef