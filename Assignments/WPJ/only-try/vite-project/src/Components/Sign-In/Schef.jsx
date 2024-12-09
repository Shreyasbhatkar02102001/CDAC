import React from 'react'
import CustomNavbar from '../Navbar'
import CarouselChefLogin from '../CarouselChefLogin'
import SignIn from '../FormLogin'
import Lfooter from '../FooterCom'


function Schef() {
  return (
    <div>
      <div>
        <CustomNavbar/>
      </div>
      <div>
        <CarouselChefLogin/>
      </div>
      <div>
        <SignIn/> 
      </div>
      <div>
        <Lfooter/>
      </div>
    </div>
  )
}

export default Schef