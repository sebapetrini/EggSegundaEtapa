import { validate } from '../../utils/validate.js'
import './box.css';

export default function Box({index, turn,setTurn,player1,player2, setWinner}) {

    const insert = (e) => {
        e.target.children[0].style.backgroundColor = turn;
        if(turn === 'red'){
            player1.current.push(index);            
        }else{
            player2.current.push(index);
        }
        e.target.children[0].style.top = e.target.offsetTop+1+'px';
        e.target.style.cursor='default';
    }

    const handleClick = (e) => {
        if(e.target.children[0]){
            insert(e);
            setTurn(turn === 'red' ? 'green' : 'red');
            if ( validate(player1.current)) {
                setWinner("Red's win");
            } else if ( validate(player2.current)) {
                setWinner("Green's wins");
            }
        }
    }
    
    return (
        <>
            <div className="box" onClick={handleClick}>
                <div className='out'></div>
            </div>
        </>
    );
}