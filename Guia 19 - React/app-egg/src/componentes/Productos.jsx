import Producto from "./Producto";


export default function Productos({productos , agregarFavoritos , eliminarFavoritos}){
    return(
       <div className="productos">
       {
         productos.length > 0 ? productos.map((producto => <Producto key={producto.id} producto={producto}  agregarFavoritos={agregarFavoritos} eliminarFavoritos={eliminarFavoritos}/>))
            : <p>no hay items en favoritos</p>
       }
       </div> 
    )
}