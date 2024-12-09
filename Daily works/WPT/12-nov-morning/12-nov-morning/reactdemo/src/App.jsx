import { BrowserRouter, Route, Routes } from "react-router-dom"
import { NavigationBar } from "./NavigationBar"
import { AppRouter } from "./AppRouter"

function App() {
  return (
    <BrowserRouter>
      <div>
        <NavigationBar />
        <AppRouter/>
      </div>
    </BrowserRouter>

  )
}

export default App
