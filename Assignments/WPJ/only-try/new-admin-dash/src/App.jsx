import 'mdb-react-ui-kit/dist/css/mdb.min.css';
import "@fortawesome/fontawesome-free/css/all.min.css";
import { useState } from 'react'
import './App.css'
import Sidebar from './Components/Sidebar/Sidebar'
import MainDash from './Components/MainDash/MainDash';
// import RightSide from './Components/RightSide/RightSide';
// No need to specify the "Sidebar" folder if it's directly under "Components"


function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
        <div className="AppGlass">
          <Sidebar/>
          <MainDash/>
          {/* <RightSide/> */}
        </div>
    </div>
  )
}

export default App
