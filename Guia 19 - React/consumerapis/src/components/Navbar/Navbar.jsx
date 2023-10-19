import { Link } from "react-router-dom";
import './Navbar.css';

export default function Navbar(){
    return(
        <>
            <nav>
                <ul>
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/pokemons">Pokemons</Link></li>
                    <li><Link to="/game">Game</Link></li>
                </ul>
            </nav>
        </>
    );
}