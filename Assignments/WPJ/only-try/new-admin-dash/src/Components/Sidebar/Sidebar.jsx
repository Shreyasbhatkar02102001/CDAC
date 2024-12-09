import React, { useState } from 'react'
import './Sidebar.css'
import Logo from '../../Imgs/logo.png'

import { SidebarDateFormat } from '../Data/Data'
import {UilSignOutAlt} from '@iconscout/react-unicons'

const Sidebar = () => {

    // to make only one item active at a time we will make use of useState hook of react 
    const [selected, setSelected] = useState(0)  // here 0 indicares first menitem 

    return (
        <div className="Sidebar">
            {/* logo */}
            <div className="logo">
                <img src={Logo} alt="" />
                <span>
                    {/* we done it separate for that we can target span and apply css on "o", basically we will apply different color to it */}
                    Ad<span>m</span>in
                </span>
            </div>

            {/* menu  */}

            <div className="menu">
                {/* here we want to item over array or map 
             for this we are using javascript map for each items iteration 
             there will be a item and index of each iteration */}
                {SidebarDateFormat.map((item, index) => {
                    return (
                        // here on className we will apply logic :
                        // i.e :
                        // if selected number is equal to index  then return 'menuItem active' which means menuItem will be active class
                        // else return 'menuItem'
                        <div className={selected ===index?'menuItem active':'menuItem'}
                            key={index}
                            // when clicked on menuItem then it will return index of that menuItem 
                            onClick={()=> setSelected(index)}
                        >
                            <item.icon />
                            <span>
                                {item.heading}
                            </span>
                        </div>
                    )
                })}

                <div className="menuItem">
                    <UilSignOutAlt/>
                </div>
            </div>
        </div>
    )
}

export default Sidebar