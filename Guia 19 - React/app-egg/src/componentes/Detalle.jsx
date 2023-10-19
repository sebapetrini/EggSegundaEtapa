import { useEffect, useState } from "react"
import { useParams } from "react-router-dom"
import {obtenerProductosPorId } from "../servicio/productoServicio"

export default function Detalle() {

    const[producto ,setproductos] = useState({})

    const{id} =useParams()


    useEffect(() => {
        obtenerProductosPorId(id).then(data =>{
            setproductos(data)
        })

    }, [id])


  return (
    <div className="detalle">
      <img src={producto.image} alt=""/>
      <div>
        <h3>{producto.title}</h3>
        <blockquote>{producto.description}</blockquote>
        <mark>{producto.price}</mark>
      </div>
    </div>
  )
}
