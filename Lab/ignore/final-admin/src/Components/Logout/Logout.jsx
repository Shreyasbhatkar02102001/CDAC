import React from 'react';
import { MDBCarousel, MDBCarouselItem } from 'mdb-react-ui-kit';

export default function Logout() {
  return (
    <MDBCarousel>
      <MDBCarouselItem itemId={1}>
        <img src='https://i.pinimg.com/originals/74/29/0a/74290a21f8d8a558e008df04df15ba65.png' className='d-block w-100' alt='...' />
      </MDBCarouselItem>
    </MDBCarousel>
  );
}