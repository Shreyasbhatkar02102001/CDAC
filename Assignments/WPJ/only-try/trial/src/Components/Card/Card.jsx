import React, { useState } from 'react'
import {AnimateSharedLayout} from 'framer-motion'
import './Card.css'
import { CircularProgressbar } from 'react-circular-progressbar';
import 'react-circular-progressbar/dist/styles.css';

const Card = (props) => {

  // animation will be achieved with the help of framer motion

  // expanded and func =  at first each card will have false boolean value i.e no card will be expanded first

  const [expanded, setExpanded] =  useState(false)

  return (
    <div className="Card">
      {/* AnimateSharedLayoutLayout basically provides more frames for expansion  */}
        <AnimateSharedLayout>
          {
            // if expanded then call ExpandedCard
            expanded? {
              // <ExpandedCard/>
            }: // if not expanded then will call compactCard
            <CompactCard param = {props}/>
          }

        </AnimateSharedLayout>
    </div>
  )
}

// define CompactCard
function CompactCard({ param }) {
  // const Png = param.png;
  
  return (
    <div className="CompactCard"
      style={{
        background : param.color.background,
        boxShadow : param.color.boxShadow
      }}>
      <div className="radialBar">
        <CircularProgressbar
          value = {param.barValue}
          text = {`${param.barValue}%`}/>
          <span>{param.title}</span>
      </div>
      <div className="detail">
        {/* <Png /> */}
        <span>${param.value}</span>
        <span>Last 24 hours</span>
      </div>
    </div>
  );
}


export default Card