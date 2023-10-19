import { useState, useRef } from 'react';
import CardWinner from '../CardWinner/cardWinner';
import Box from '../box/box';
import './table.css'

export default function Table() {

    const [turn , setTurn] = useState('red');
    const [winner, setWinner] = useState();
    const player1 = useRef([]);
    const player2 = useRef([]);

    return (
        <div className="table" id='table'>
            {
                [...Array(100)].map((_, i) => {
                        return <Box 
                                    key={i} 
                                    index={i} 
                                    turn={turn} 
                                    setTurn={setTurn} 
                                    player1={player1}   
                                    player2={player2}
                                    setWinner={setWinner}
                                    />
                })
            }{
                winner && <CardWinner winner={winner} />
            }
        </div>
    );
}

