import React from 'react';
import Carousel from 'react-bootstrap/Carousel';
import './CarouselCom.css';

function CarouselAdminLogin() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://images.pexels.com/photos/6692150/pexels-photo-6692150.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
          alt="Community Event 1"
          style={{ maxHeight: '800px' }}
        />
        <div className="carousel-caption text-overlay">
          <h1>
            Admin Signin
          </h1>
          {/* Optional additional text can be added below */}
          {/* <p>Additional text below the heading.</p> */}
        </div>
      </Carousel.Item>
    </Carousel>
  );
}

export default CarouselAdminLogin;
