import './cardWinner.css';

export default function CardWinner({winner}) {
    return (
        <div className='win'>
            <div className='cardWinner'>
                {winner}
            </div>
        </div>
    );
}