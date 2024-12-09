import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import './CarouselCom.css';

function CarouselChefLogin() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://wallpaperaccess.com/full/8613758.jpg"
          alt="Community Event 1"
          style={{ maxHeight: '800px' }}
        />
        <div className="carousel-caption text-overlay">
          <h1>
            Chef Signin
          </h1>
          {/* Optional additional text can be added below */}
          {/* <p>Additional text below the heading.</p> */}
        </div>
      </Carousel.Item>
    </Carousel>
  );
}

export default CarouselChefLogin;
