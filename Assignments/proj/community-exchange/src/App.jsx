import 'bootstrap/dist/css/bootstrap.min.css';
import { useState } from 'react'
import './App.css'
import Schef from './Components/Sign-In/Schef';
import Scustomer from './Components/Sign-In/Scustomer';
import Sadmin from './Components/Sign-In/Sadmin';
import Radmin from './Components/Register/Radmin';
import Rchef from './Components/Register/Rchef';
import Rcustomer from './Components/Register/Rcustomer';





function App() {   //  Login example

  return (
    <div>
      {/* <Sadmin/>  */}
      {/* <Schef/> */}
      {/* <Scustomer/> */}


      {/* <Radmin/> */}
      {/* <Rchef/> */}
      <Rcustomer/>
    </div>
  )
}

export default App
