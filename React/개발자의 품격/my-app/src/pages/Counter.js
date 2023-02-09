import React, {useState} from "react";

const Counter = () => {

    const [num, setNumber] = useState(0);
    const increase = () => {
            setNumber(num+1);            
    }

    return (
        <>
            <button onClick={increase}>+1</button>
            <button>11</button>
            <p>{num}</p>       
        </>
    );
}