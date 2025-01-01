using OnlineShoppingPortal.Models;
using MySql.Data.MySqlClient;
using Microsoft.CodeAnalysis.Elfie.Diagnostics;
using System.Data;

namespace OnlineShoppingPortal.Repositories
{

    // Databaes connectivity CRUD  from MySQL

    public class DatabaseRepository : IDataRepository, IDisposable
    {
        string connectionString = "server=localhost; database=ecommerce; user=root; password=cdac";

       

        public void Delete(int id)
        {
            MySqlConnection connection = new MySqlConnection(connectionString);
            connection.Open();

            try
            {
                string query = "delete * from products where product_id=" + id;
                MySqlCommand command = new MySqlCommand(query, connection);
                command.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw ex;
            }
            finally
            {
                connection.Close();
            }
        }

        public void Dispose()
        {
            throw new NotImplementedException();
        }

        public List<Product> GetAll()
        {
            MySqlConnection connection = new MySqlConnection(connectionString);
            connection.Open();
            string query = "select * from products ";
            MySqlCommand command = new MySqlCommand(query, connection);
            MySqlDataReader reader = command.ExecuteReader();
            //command.ExecuteNonQuery(); //insert, update, delete 
            //command.ExecuteScalar();   //select single value 
            //command.ExecuteReader(); 

            List<Product> products = new List<Product>();
            while (reader.Read())
            {
                Product product = new Product();
                product.Id = reader.GetInt32("id");
                product.Name = reader.GetString("name");
                product.Description = reader.GetString("description");
                product.UnitPrice = reader.GetDouble("unit_price");
                product.Quantity = reader.GetInt32("stock_available");
                product.Image = reader.GetString("image");
                products.Add(product);
            }
            connection.Close();
            return products;
        }

        public Product GetById(int id, Product products)
        {
            string connectionString = "server=localhost;database=ecommerce;user=root;password=cdac";
            MySqlConnection connection = new MySqlConnection(connectionString);
            string query = "SELECT *  from products WHERE product_id=@product_id";

            MySqlCommand command = new MySqlCommand(query, connection);
            command.Parameters.Add(new MySqlParameter("@product_id", id));
            MySqlDataReader reader = command.ExecuteReader();
            Product product = new Product();
            try
            {
                connection.Open();
                if (reader.Read())
                {
                    product.Id = reader.GetInt32("product_id");
                    product.Name = reader.GetString("product_title");
                    product.UnitPrice = reader.GetDouble("unit_price");
                    product.Quantity = reader.GetInt32("stock_available");
                    product.Description = reader.GetString("description");
                    product.Image = reader.GetString("image");
                }
            }
            catch (MySqlException ee)
            {

                throw ee;
            }
            finally
            {
                connection.Close();
            }


            return product;
        }

        public Product GetById(int id)
        {
            string connectionString = "server=localhost;database=ecommerce;user=root;password=cdac";
            MySqlConnection connection = new MySqlConnection(connectionString);
            string query = "SELECT *   from products WHERE product_id=@product_id";

            MySqlCommand command = new MySqlCommand(query, connection);
            command.Parameters.Add(new MySqlParameter("@product_id", id));
            MySqlDataReader reader = command.ExecuteReader();
            Product product = new Product();
            try
            {
                connection.Open();
                if (reader.Read())
                {
                    product.Id = reader.GetInt32("product_id");
                    product.Name = reader.GetString("product_title");
                    product.UnitPrice = reader.GetDouble("unit_price");
                    product.Quantity = reader.GetInt32("stock_available");
                    product.Description = reader.GetString("description");
                    product.Image = reader.GetString("image");
                }
            }
            catch (MySqlException ee)
            {

                throw ee;
            }
            finally
            {
                connection.Close();
            }


            return product;
        }



        public void Insert(Product product)
        {
            throw new NotImplementedException();
        }

        public void Update(Product product)
        {
            throw new NotImplementedException();
        }
    }
}
