import React from 'react';
import { MDBBtn, MDBTable, MDBTableHead, MDBTableBody, MDBPagination, MDBPaginationItem, MDBPaginationLink } from 'mdb-react-ui-kit';

const ChefTable = ({ TableData }) => {
  return (
    <div className="mb-4">
      <h4>Chef Table</h4>
      <MDBTable align="middle" hover responsive>
        <MDBTableHead dark>
          <tr>
            <th>Chef ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Specialties</th>
            <th>Actions</th>
          </tr>
        </MDBTableHead>
        <MDBTableBody>
          {TableData.map((row) => (
            <tr key={row.chef_id}>
              <td>{row.chef_id}</td>
              <td>{row.name}</td>
              <td>{row.email}</td>
              <td>{row.phone_number}</td>
              <td>{row.specialties}</td>
              <td>
                <MDBBtn color='dark' rounded size='sm'>
                  Edit
                </MDBBtn>
                <MDBBtn color='light' rounded size='sm'>
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

export default ChefTable;
