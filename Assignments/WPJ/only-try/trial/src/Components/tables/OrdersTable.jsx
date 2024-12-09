import React from 'react';
import { MDBBtn, MDBTable, MDBTableHead, MDBTableBody, MDBPagination, MDBPaginationItem, MDBPaginationLink } from 'mdb-react-ui-kit';

const OrderTable = ({ TableData }) => {
  return (
    <div className="mb-4">
      <h4>Order Table</h4>
      <MDBTable align="middle" hover responsive>
        <MDBTableHead dark>
          <tr>
            <th>Order ID</th>
            <th>Customer ID</th>
            <th>Chef ID</th>
            <th>Total Price</th>
            <th>Order Status</th>
            <th>Actions</th>
          </tr>
        </MDBTableHead>
        <MDBTableBody>
          {TableData.map((row) => (
            <tr key={row.order_id}>
              <td>{row.order_id}</td>
              <td>{row.customer_id}</td>
              <td>{row.chef_id}</td>
              <td>{row.total_price}</td>
              <td>{row.order_status}</td>
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

export default OrderTable;
