import React from 'react';
import { MDBBtn, MDBTable, MDBTableHead, MDBTableBody, MDBPagination, MDBPaginationItem, MDBPaginationLink } from 'mdb-react-ui-kit';

const MenuTable = ({ TableData }) => {
  return (
    <div className="mb-4">
      <h4>Menu Table</h4>
      <MDBTable align="middle" hover responsive>
        <MDBTableHead dark>
          <tr>
            <th>Menu ID</th>
            <th>Chef ID</th>
            <th>Dish Name</th>
            <th>Price</th>
            <th>Availability</th>
            <th>Actions</th>
          </tr>
        </MDBTableHead>
        <MDBTableBody>
          {TableData.map((row) => (
            <tr key={row.menu_id}>
              <td>{row.menu_id}</td>
              <td>{row.chef_id}</td>
              <td>{row.dish_name}</td>
              <td>{row.price}</td>
              <td>{row.availability}</td>
              <td>
                <MDBBtn color='link' rounded size='sm'>
                  Edit
                </MDBBtn>
                <MDBBtn color='link' rounded size='sm'>
                  Delete
                </MDBBtn>
              </td>
            </tr>
          ))}
        </MDBTableBody>
      </MDBTable>
      <MDBPagination className="justify-content-center">
        <MDBPaginationItem>
          <MDBPaginationLink href="#">Previous</MDBPaginationLink>
        </MDBPaginationItem>
        <MDBPaginationItem active>
          <MDBPaginationLink href="#">1</MDBPaginationLink>
        </MDBPaginationItem>
        <MDBPaginationItem>
          <MDBPaginationLink href="#">2</MDBPaginationLink>
        </MDBPaginationItem>
        <MDBPaginationItem>
          <MDBPaginationLink href="#">Next</MDBPaginationLink>
        </MDBPaginationItem>
      </MDBPagination>
    </div>
  );
};

export default MenuTable;
