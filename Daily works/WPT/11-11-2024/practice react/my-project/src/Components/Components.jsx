import React, { useState } from 'react'

export const Components = () => {
    const [count,setCount] = useState(0)
    const increment =()=> {
        setCount(count+1)
    }
    const decrement =()=> {
        setCount(count-1)
    }
  return (
    <div>
        <button onClick={()=>setCount(increment)}></button>
        {count}
        <button onClick={()=>setCount(decrement)}></button>
    </div>
  )
}


















