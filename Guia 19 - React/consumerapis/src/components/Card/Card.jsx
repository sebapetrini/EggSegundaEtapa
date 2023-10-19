import { useState, useEffect } from 'react';
import './card.css'

export default function Card({ pokemon }) {

    const [pokemonData, setPokemonData] = useState([]);

    useEffect(() => {
        fetch(pokemon.url)
            .then((response) => response.json())
            .then((data) => setPokemonData(data));
    }, [pokemon.url]);

    return (
        <div className="pokemon" onClick={() => console.log(pokemon)}>
            <h3>{pokemon.name}</h3>
            <img src={pokemonData.sprites?.front_default} alt={pokemon.name} />
            <p>{pokemonData.types?.map((type) => type.type.name).join(", ")}</p>
        </div>
    );
}