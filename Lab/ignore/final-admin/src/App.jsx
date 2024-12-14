import 'mdb-react-ui-kit/dist/css/mdb.min.css';
import "@fortawesome/fontawesome-free/css/all.min.css";
import { BrowserRouter , Routes, Route, Navigate } from 'react-router-dom';
import Sidebar from './Components/Sidebar/Sidebar';
import MainDash from './Components/MainDash/MainDash';
import CustomersDash from './Components/MainDash/CustomersDash';
import ChefsDash from './Components/MainDash/ChefsDash';
import OrdersDash from './Components/MainDash/OrdersDash';
import ContactUsDash from './Components/MainDash/ContactUsDash';
import Logout from './Components/Logout/Logout';
import './App.css';

function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <div className="AppGlass">
          <Sidebar />
          <Routes>
            <Route path="/" element={<Navigate to="/dashboard" replace />} />
            <Route path="/dashboard" element={<MainDash />} />
            <Route path="/customers" element={<CustomersDash />} />
            <Route path="/chefs" element={<ChefsDash />} />
            <Route path="/contact" element={<ContactUsDash />} />
            <Route path="/orders" element={<OrdersDash />} />
            <Route path="/logout" element={<Logout />} />
          </Routes>
        </div>
      </div>
    </BrowserRouter>
  );
}

export default App;