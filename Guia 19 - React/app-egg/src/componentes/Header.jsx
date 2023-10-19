import React from "react"
import { Link } from "react-router-dom"
import logoimg from "../imagenes/huevo.png"
export default function Header(){
    return(
        <header className="header">
            <Link to={'/'} className="icono-header"><img src={logoimg} alt=""/></Link>
            <nav className="nav-header">
                <Link to={"/"}>Productos</Link>
                <Link to={"/favoritos"}>Favoritos</Link>
            </nav>
        </header>
    )
}