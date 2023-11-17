/* eslint-disable @typescript-eslint/no-unused-vars */

import { useState } from "react"
import { FoodData } from "../../../interface/FoodData";
import { useFoodDataMutate } from "../../../hooks/useFoodDataMutate";


interface InputProps {
    label:string,
    value: string | number,
    updateValue: (value: string | number) => void
}

// eslint-disable-next-line @typescript-eslint/no-unused-vars
const Input = ({ label, value, updateValue }: InputProps) => {
    return (
        <>
        <label>{label}</label>
        <input value={value} onChange={event => updateValue(event.target.value)}/>
        </>
    )
}


export function  CreateModalProps() {
    const [title, setTitle] = useState(""); //Um hook para criar uma variavel
    const [price, setPrice] = useState(0);
    const [image, setImage] = useState("");
    const { mutate } = useFoodDataMutate();
    
    const submit = () => {
        const foodData: FoodData = {
            title, price, image,
            id: 0
        }

        mutate(foodData)
    }

  return (
    <div className='modal-overflow'>
        <div className="modal-body">
            <h2>Cadastre um novo item</h2>
            <form className="input-container">
                <input label="title" value={title} updateValue={setTitle} />
                <input label="price" value={price} updateValue={setPrice} />
                <input label="image" value={image} updateValue={setImage} />
            </form>
            <button onClick={submit} className="btn-secondary" formMethod="POST"></button>
        </div>
    </div>
  )
}


