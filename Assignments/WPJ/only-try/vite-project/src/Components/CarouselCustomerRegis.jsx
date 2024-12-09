import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import './CarouselCom.css';

function CarouselCustomerRegis() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://cdn.pixabay.com/photo/2017/07/16/09/11/road-2508733_960_720.jpg"
          alt="Community Event 1"
          style={{ maxHeight: '800px' }}
        />
        <div className="carousel-caption text-overlay">
          <h1>
            Customer Registration
          </h1>
          {/* Optional additional text can be added below */}
          {/* <p>Additional text below the heading.</p> */}
        </div>
      </Carousel.Item>
    </Carousel>
  );
}

export default CarouselCustomerRegis;
