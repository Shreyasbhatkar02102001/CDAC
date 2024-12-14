import React from "react";
import './Cards.css';
// import { cardsData } from "../../Data/Data";

import Card from "../Card/Card";
import { CardsData } from '../Data/Data';  // Adjust the path to point to the Data folder


const Cards = () => {
  return (
    <div className="Cards">
      {CardsData.map((card, id) => {
        return (
          <div className="parentContainer" key={id}>
            <Card  // props
              title={card.title}
              color={card.color}
              barValue={card.barValue}
              value={card.value}
            />
          </div>
        );
      })}
    </div>
  );
};

export default Cards;