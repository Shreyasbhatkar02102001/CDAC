import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import './CarouselCom.css';

function CarouselAdminRegis() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://images.pexels.com/photos/6692136/pexels-photo-6692136.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
          alt="Community Event 1"
          style={{ maxHeight: '800px' }}
        />
        <div className="carousel-caption text-overlay">
          <h1>
            Admin Registration
          </h1>
        </div>
      </Carousel.Item>
    </Carousel>
  );
}

export default CarouselAdminRegis;
