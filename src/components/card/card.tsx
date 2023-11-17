
import "./card.css"

interface CardProps {
    price: number,
    title: string,
    image: string

}
export function card(_props: CardProps) {
  return (
    <div className='card'>
        <img src={_props.image} alt="" />
        <h2>{_props.title}</h2>
        <p><strong>Valor:</strong>{_props.price}</p>
    </div>
  )
}

card.propTypes = {}

export default card
