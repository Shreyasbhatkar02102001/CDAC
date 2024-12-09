import React from 'react'
import CustomNavbar from '../Navbar'
import Lfooter from '../FooterCom'
import FormRegister from '../FormRegister'
import CarouselAdminRegis from '../CarouselAdminRegis'

function Radmin() {   // Resgister
    // const [count, setCount] = useState(0)
  
    return (
      <div>
        <div>
          <CustomNavbar/>
        </div>
        <div>
          <CarouselAdminRegis/>
        </div>
        <div>
          <FormRegister/> 
        </div>
        <div>
          <Lfooter/>
        </div>
      </div>
    )
  }

  export default Radmin