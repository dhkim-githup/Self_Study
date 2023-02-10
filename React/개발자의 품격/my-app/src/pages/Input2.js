import React, {useState} from "react";

const Input2 = () => {

    const [txt, setTxt] = useState("");

    const onChange = (e) =>{
        setTxt(e.target.value)
    };
    
    return (
        <div>
            <div>
                <label>이름</label>
                <input type="text" />
            </div>

            <div>
                <label>이메일</label>
                <input type="email" />
            </div>

            <div>
                <label>전화번호</label>
                <input type="tel" />
            </div>

            <br />
            <p>{txt}</p>
        </div>
    );
}

export default Input2;