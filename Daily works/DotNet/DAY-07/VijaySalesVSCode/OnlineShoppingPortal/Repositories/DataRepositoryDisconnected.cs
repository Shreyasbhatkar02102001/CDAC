using MySql.Data.MySqlClient;
using OnlineShoppingPortal.Models;
using System.Data;

namespace OnlineShoppingPortal.Repositories
{
    public class DataRepositoryDisconnected : IDataRepository
    {
        string connectionString = "server=localhost;database=ecommerce;user=root;password=password";

        public void Delete(int id)
        {
             
        }

        public List<Product> GetAll()
        {
            IDbConnection connection = new MySqlConnection(connectionString);
            string query = "SELECT * FROM products; SELECT * from Users";
            IDbCommand command = new MySqlCommand(query, connection as MySqlConnection);
            MySqlDataAdapter adapter=new MySqlDataAdapter(query, connection as MySqlConnection);
            DataSet dataSet = new DataSet();
            adapter.Fill(dataSet);
            //we are now woring with disconnectd data
            //using dataset
            DataTable dt = dataSet.Tables[0];
            DataRowCollection rows= dt.Rows;
            List<Product> products = new List<Product>();
            foreach (DataRow row in rows)
            {
                DataRow dr = row;
                Product product = new Product();
                product.Id = int.Parse(dr["product_id"].ToString());
                product.Name = dr["product_title"].ToString();
                product.UnitPrice = double.Parse(dr["unit_price"].ToString());
                product.Quantity = int.Parse(dr["stock_available"].ToString());
                product.Description = dr["description"].ToString();
                product.Image = dr["image"].ToString();
                products.Add(product);
            }
            return products;
        }

        public Product GetById(int id)
        {
            return new Product();

        }

        public void Insert(Product product)
        {
            
        }

        public void Update(Product product)
        {
            
        }
    }
}
