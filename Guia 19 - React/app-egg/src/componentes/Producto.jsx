import React, { useState } from 'react'
import { Link } from 'react-router-dom';
import megusta from '../imagenes/me-gusta.png'
import nomegusta from '../imagenes/corazon.png'




export default function Producto({producto , agregarFavoritos , eliminarFavoritos}) {
    const [favorito ,setfavorito] = useState(false)

    function handleClick(){
        if (favorito) {
            eliminarFavoritos(producto)
            setfavorito(false)
        }else{
            agregarFavoritos(producto)
            setfavorito(true)
        }
    }


  return (
    <div className="producto">
      <Link to={`/producto/${producto.id}`}><img src={producto.image} alt=''/></Link>
      <div className="info">
        <p>{producto.title}</p>
        <mark>{producto.price}</mark>
      </div>
      {
        favorito ? 
        <img className='megusta' onClick={handleClick} src={nomegusta} alt=''/>
        :
        <img className='nomegusta' onClick={handleClick} src={megusta} alt=''/>
      }
    </div>
  )
}
