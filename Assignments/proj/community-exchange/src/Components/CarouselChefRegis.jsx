import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import './CarouselCom.css';

function CarouselChefRegis() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://cdn.pixabay.com/photo/2019/03/04/14/35/sydney-4034244_1280.jpg"
          alt="Community Event 1"
          style={{ maxHeight: '800px' }}
        />
        <div className="carousel-caption text-overlay">
          <h1>
            Chef Registration
          </h1>
          {/* Optional additional text can be added below */}
          {/* <p>Additional text below the heading.</p> */}
        </div>
      </Carousel.Item>
    </Carousel>
  );
}

export default CarouselChefRegis;
