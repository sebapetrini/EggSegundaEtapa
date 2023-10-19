export async function obtenerProductos(){
    const response =  await fetch('https://fakestoreapi.com/products')
    const data = await response.json()
    return data
}

export async function obtenerProductosPorId(id){
    const response =  await fetch(`https://fakestoreapi.com/products/${id}`)
    const data = await response.json()
    return data
}