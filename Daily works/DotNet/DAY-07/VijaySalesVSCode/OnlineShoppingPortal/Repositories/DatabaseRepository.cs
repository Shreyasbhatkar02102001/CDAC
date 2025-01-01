using OnlineShoppingPortal.Models;
using MySql.Data.MySqlClient;
using Microsoft.CodeAnalysis.Elfie.Diagnostics;
using System.Data;


namespace OnlineShoppingPortal.Repositories
{

    //Distributed Programming
    // Interoperability

    // Databaes connectivity CRUD  from MySQL
    // COM : Component Object Model
    // Active X: Technology
    // OLE: Object Linking and Embedding
    // ADO: ActiveX Data Object 
    //Entperprice Technologies:
    //Active X
    //Direct X

    //.NET Framework:
    //ADO.NET
    // Win Fx
    // WPF, WCF, WF, WIF



    //J2EE:Java Enterprise Edition
    //Distributed Computing
    //JMS, JNDI, EJB,.......



    // 

    //Online Solution: deployed on web: protocol HTTP, JSON
    //Corss Platform using HTTP
    //REST Full API: HTTP

    //ADO.NET Object Model
    //Interoperabilty: Meaning Interoperability
    //Corss Platform:


    /*
        ado.NET OBJECT model:
        Set of interfaces:
         IDbConnection,
         IDbCommand,
         IDbDataReader, IDbDataAdapter,
         DataSet, DataTable, DataRow, DataColumn
    

     
    1.Connected Data Access

            MS-SQL server (official  RDBMS: provided by Microsoft)
            System.Data.SqlClient

                SqlConnection,SqlCommand, SqlParameter, SqlDataReader
           
            mysql:
            MySql.Data.MySqlClient

            MySqlConnection, MySqlCommand, MySqlParameter, MySqlDataReader
            
            oracle:
                Oracle.ManagedDataAccess.dll
            
            Oracle Data Provider for .NET (ODP.NET) Core.
            OracleConnection, OracleCommand, OracleParameter, OracleDataReader

        2.Disconnected  Data Access

            MySqlConnection, MySqlCommand,MySqlParameter, DataSet, MySqlDataAdapter


     */


    public class DatabaseRepository : IDataRepository,IDisposable
    {

        string connectionString = "server=localhost;database=ecommerce;user=root;password=password";

        public List<Product> GetAll()
        {

            //read data from database
            //using ADO.NET  (JDBC like)
            //using Dapper   (Micro ORM)
            //using Entity Framework Core (ORM)  (hibernate)

            IDbConnection connection = new MySqlConnection(connectionString);
            connection.Open();
            string query = "SELECT * FROM products";
            IDbCommand command = new MySqlCommand(query, connection as MySqlConnection);
            IDataReader reader = command.ExecuteReader();
            //command.ExecuteNonQuery();  //insert, update, delete
            //command.ExecuteScalar();  //select single value
            //command.ExecuteReader();  //select multiple values

            List<Product> products = new List<Product>();
            while (reader.Read())
            {
                Product product = new Product();
                product.Id = int.Parse(reader["product_id"].ToString());
                product.Name = reader["product_id"].ToString();
                product.UnitPrice = double.Parse(reader["unit_price"].ToString());
                product.Quantity = Convert.ToInt16(reader["stock_available"]);
                product.Description = reader["description"].ToString();
                product.Image = reader["image"].ToString();
                products.Add(product);
            }
            connection.Close();
            return products;
        }

        public Product GetById(int id)
        {
            string connectionString = "server=localhost;database=ecommerce;user=root;password=password";
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
            catch  (MySqlException ee){

                throw ee;
            }
            finally
            {
                connection.Close();
            }
           
          
            return product;
        }

        //CRUD Operations
        public void Delete(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    connection.Open();
                    string query = "DELETE from products WHERE product_id=@id";
                    MySqlCommand command = new MySqlCommand(query, connection);
                    command.Parameters.Add(new MySqlParameter("@id", id));
                    command.ExecuteNonQuery();  //insert, update, delete
                }

                catch (MySqlException exp)
                {
                    throw exp;
                }
                finally
                {
                    connection.Close();
                }
            }
        }

        public void Insert(Product product)
        {
            // parametrized Query
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    string query = "INSERT INTO product(Title, Stock, Price, Description,  ImageUrl) VALUES (@Title, @Stock, @Price, @Description, @Image)";
                    MySqlCommand command = new MySqlCommand(query, connection);
                    command.Parameters.Add(new MySqlParameter("@Title", product.Name));
                    command.Parameters.Add(new MySqlParameter("@Stock", product.Quantity));
                    command.Parameters.Add(new MySqlParameter("@Price", product.UnitPrice));
                    command.Parameters.Add(new MySqlParameter("@Description", product.Description));
                    command.Parameters.Add(new MySqlParameter("@Image", product.Image));
                    connection.Open();
                    command.ExecuteNonQuery();  //insert, update, delete
                }
                catch (MySqlException ee)
                {
                    throw ee;
                }
                finally
                {
                    connection.Close();
                }
            }
        }

        public void Update(Product product)
        {
            //command.ExecuteNonQuery();  //insert, update, delete

        }

        public void Dispose()
        {
            //Write logic for Clean up if required
            GC.SuppressFinalize(this);
        }
        ~DatabaseRepository()
        {
            //Write logic for Clean up 
        }
    }
}
