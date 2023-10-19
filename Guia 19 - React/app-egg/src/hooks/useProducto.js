import {useEffect , useState } from 'react'
import { obtenerProductos } from '../servicio/productoServicio'

export default function useProducto() {
    const [productos , setproductos] = useState([])
    const [favoritos , setfavoritos] = useState([])

    useEffect(()=>{
        obtenerProductos().then(data =>{
            setproductos(data)
        })

    },[])

    function agregarFavoritos(producto){
        const newFavoritos = [...favoritos]
        newFavoritos.push(producto)
        setfavoritos(newFavoritos)
    }

    function eliminarFavoritos(producto){
        const newFavoritos = favoritos.filter(e => e.id !== producto.id )
        setfavoritos(newFavoritos)
    }

    return{productos ,favoritos , agregarFavoritos ,eliminarFavoritos}
}

/* const newFavoritos = [...favoritos]
newFavoritos.push(producto)
setFavoritos(newFavoritos)

=Se puede simplificar=

setFavoritos([...favoritos, producto])
*/