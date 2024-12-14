import React from 'react'
import './Card.css'
import { CircularProgressbar } from 'react-circular-progressbar';
import 'react-circular-progressbar/dist/styles.css';

const Card = (props) => {

  return (
    <div className="Card">
      {
          <CompactCard param={props} />
      }
    </div>
  )
}

// define CompactCard
function CompactCard({ param }) {

  return (
    <div className="CompactCard"
      style={{
        background: param.color.background
      }}>
      <div className="radialBar">
        <CircularProgressbar
          value={param.barValue}
          text={`${param.barValue}%`} />
        <span>{param.title}</span>
      </div>
      <div className="detail">
        <span>${param.value}</span>
        <span>Last 24 hours</span>
      </div>
    </div>
  );
}


export default Card