import {BrowserRouter , Route ,Routes} from 'react-router-dom'
import './App.css'
import Ejemplo from './componentes/Ejemplo'

function App() {


  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Ejemplo/>}/>
        </Routes>
      </BrowserRouter>

    </div>
  )
}

export default App
