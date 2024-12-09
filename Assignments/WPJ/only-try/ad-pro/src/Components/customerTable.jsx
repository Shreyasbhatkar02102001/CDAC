import React from 'react';

function CustomerTable() {
  return (
    <div>
      <h2>Customers List</h2>
      {/* Add your table or customer list implementation here */}
      <table className="table table-striped">
        <thead>
          <tr>
            <th>#</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>John Doe</td>
            <td>john@example.com</td>
            <td>+1234567890</td>
          </tr>
          <tr>
            <td>2</td>
            <td>Jane Smith</td>
            <td>jane@example.com</td>
            <td>+0987654321</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default CustomerTable;
