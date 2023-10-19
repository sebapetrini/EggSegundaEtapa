import { useState, useEffect, useRef } from "react";
import Card from "../../components/Card/Card";
import './pokemons.css'


export default function Pokemons(){

    const [pokemons, setPokemons] = useState([]);
    const [page, setPage] = useState("https://pokeapi.co/api/v2/pokemon?limit=100");
    const [nextPage, setNextPage] = useState();
    const [previousPage, setPreviousPage] = useState();

    const num = useRef(0);

    useEffect(() => {
        fetch(page)
            .then((response) => response.json())
            .then((data) => {
                setPokemons(data.results);
                setNextPage(data.next);
                setPreviousPage(data.previous);
            });
    }, [page]);


    const handleNextPage = () => {
            setPage(nextPage);
    };

    const handlePreviousPage = () => {
            setPage(previousPage);
    };


    return(
        <>
            <h1>Pokemons</h1>
            <div className="pages">
                <button onClick={handlePreviousPage}>{"<"}</button>
                <button onClick={handleNextPage}> {">"} </button>
            </div>
            <div className="pokemons">
                {
                    pokemons.map((pokemon) => (
                        <Card pokemon={pokemon} key={pokemon.name}/>
                    ))
                }
            </div>
            
        </>
    );
}