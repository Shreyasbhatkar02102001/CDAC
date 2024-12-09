
// Dummy Data
export  const TableData = {
  chefs: [
    { chef_id: 1, name: 'Priya Sharma', email: 'priya.sharma@gmail.com', phone_number: '9876543210', specialties: 'North Indian, Desserts' },
    { chef_id: 2, name: 'Rahul Verma', email: 'rahul.verma@gmail.com', phone_number: '9867534210', specialties: 'South Indian, Vegan' },
    { chef_id: 3, name: 'Anjali Menon', email: 'anjali.menon@gmail.com', phone_number: '9845671234', specialties: 'Kerala Cuisine, Seafood' },
  ],
  customers: [
    { customer_id: 1, name: 'Arjun Kapoor', email: 'arjun.kapoor@gmail.com', phone_number: '9998765432', address: '123 MG Road, Bengaluru, Karnataka' },
    { customer_id: 2, name: 'Simran Kaur', email: 'simran.kaur@gmail.com', phone_number: '9987654321', address: '456 Lajpat Nagar, New Delhi' },
    { customer_id: 3, name: 'Rajesh Iyer', email: 'rajesh.iyer@gmail.com', phone_number: '9876548765', address: '789 Anna Salai, Chennai, Tamil Nadu' },
  ],
  orders: [
    { order_id: 1, customer_id: 1, chef_id: 2, total_price: 450.0, order_status: 'delivered' },
    { order_id: 2, customer_id: 2, chef_id: 1, total_price: 300.0, order_status: 'pending' },
    { order_id: 3, customer_id: 3, chef_id: 3, total_price: 650.0, order_status: 'canceled' },
  ],
  menu: [
    { menu_id: 1, chef_id: 1, dish_name: 'Butter Chicken', price: 250.0, availability: 'available' },
    { menu_id: 2, chef_id: 2, dish_name: 'Masala Dosa', price: 120.0, availability: 'available' },
    { menu_id: 3, chef_id: 3, dish_name: 'Prawn Curry', price: 350.0, availability: 'unavailable' },
  ],
};