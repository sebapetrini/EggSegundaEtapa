import {BrowserRouter , Route , Routes} from 'react-router-dom'
import './App.css'
import Footer from './componentes/Footer'
import Header from './componentes/Header'
import Productos from './componentes/Productos'
import useProducto from './hooks/useProducto'
import Detalle from './componentes/Detalle'
function App() {

  const{productos ,favoritos , agregarFavoritos , eliminarFavoritos} = useProducto()

  return(
    <BrowserRouter>
      <Header/>
      <Routes>
        <Route path='/' element={<Productos productos ={productos} eliminarFavoritos={eliminarFavoritos} agregarFavoritos={agregarFavoritos}/>}/>
        <Route path='/producto/:id' element={<Detalle/>}/>
        <Route path='/favoritos' element={<Productos productos ={favoritos} eliminarFavoritos={eliminarFavoritos} agregarFavoritos={agregarFavoritos}/>}/>
      </Routes>
      <Footer/>


    </BrowserRouter>




  )
}

export default App
