import React from 'react';
import { MDBBtn, MDBTable, MDBTableHead, MDBTableBody, MDBPagination, MDBPaginationItem, MDBPaginationLink } from 'mdb-react-ui-kit';

const ContactUsTable = ({ TableData }) => {
  return (
    <div className="mb-4">
      <h4>Inquiries Table</h4>
      <MDBTable align="middle" hover responsive>
        <MDBTableHead dark>
          <tr>
            <th>Inquiry ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Message</th>
            <th>Status</th>
            <th>Actions</th>
          </tr>
        </MDBTableHead>
        <MDBTableBody>
          {TableData.map((row) => (
            <tr key={row.inquiry_id}>
              <td>{row.inquiry_id}</td>
              <td>{row.name}</td>
              <td>{row.email}</td>
              <td>{row.message}</td>
              <td>{row.status}</td>
              <td>
                <MDBBtn color="dark" rounded size="sm">
                  Respond
                </MDBBtn>
                <MDBBtn color="light" rounded size="sm">
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

export default ContactUsTable;
