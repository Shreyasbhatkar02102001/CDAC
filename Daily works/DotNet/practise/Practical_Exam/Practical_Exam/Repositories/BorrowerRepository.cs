using MySql.Data.MySqlClient;
using Practical_Exam.Models;

namespace Practical_Exam.Repositories
{
    public class BorrowerRepository : IBorrowerRepository
    {

        string connectionString = "server=localhost; database=practical; user=root; password=cdac";
        public void Add(Borrower borrower)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                //BorrowerId, Name, Address, 
                //ContactInfo, CreatedDate, UpdatedDate

                connection.Open();
                string query = "insert into borrower(Name, Address, ContactInfo) values(@Name, @Address, @ContactInfo)";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@Name", borrower.Name);
                cmd.Parameters.AddWithValue("@Address", borrower.Address);
                cmd.Parameters.AddWithValue("@ContactInfo", borrower.ContactInfo);
                cmd.ExecuteNonQuery();
            }
        }

        

        public void Delete(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                //BorrowerId, Name, Address, 
                //ContactInfo, CreatedDate, UpdatedDate

                connection.Open();
                string query = "delete from borrower where BorrowerId=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@id", id);
                cmd.ExecuteNonQuery();
            }
        }

        public List<Borrower> GetAllBooks(Borrower borrower)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "select * from Borrower";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                MySqlDataReader reader = cmd.ExecuteReader();

                List<Borrower> list = new List<Borrower>();

                while (reader.Read())
                {
                    //BorrowerId, Name, Address, 
                    //ContactInfo, CreatedDate, UpdatedDate
                    Borrower book1 = new Borrower();
                    book1.BorrowerId = int.Parse(reader["BorrowerId"].ToString());
                    book1.Name = reader["Name"].ToString();
                    book1.Address = reader["Address"].ToString();
                    book1.ContactInfo = int.Parse(reader["ContactInfo"].ToString());
                    book1.CreatedDate = DateTime.Parse(reader["CreatedDate"].ToString());
                    book1.UpdatedDate = DateTime.Parse(reader["UpdatedDate"].ToString());
                    list.Add(book1);
                }

                return list;
            }
        }

        public Borrower GetBorrowerById(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "select * from Borrower where BorrowerId=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@id", id);
                MySqlDataReader reader = cmd.ExecuteReader();

                Borrower book1 = new Borrower();

                if (reader.Read())
                {
                    //BorrowerId, Name, Address, 
                    //ContactInfo, CreatedDate, UpdatedDate
                    //Borrower book1 = new Borrower();
                    book1.BorrowerId = int.Parse(reader["BorrowerId"].ToString());
                    book1.Name = reader["Name"].ToString();
                    book1.Address = reader["Address"].ToString();
                    book1.ContactInfo = int.Parse(reader["ContactInfo"].ToString());
                    book1.CreatedDate = DateTime.Parse(reader["CreatedDate"].ToString());
                    book1.UpdatedDate = DateTime.Parse(reader["UpdatedDate"].ToString());
                    //list.Add(book1);
                }

                return book1;
            }
        }

        public void Update(Borrower borrower)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                //BorrowerId, Name, Address, 
                //ContactInfo, CreatedDate, UpdatedDate

                connection.Open();
                string query = "update book set(Name=@Name, Address=@Address, ContactInfo=@ContactInfo) where BorrowerId=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@id", borrower.BorrowerId);
                cmd.Parameters.AddWithValue("@Name", borrower.Name);
                cmd.Parameters.AddWithValue("@Address", borrower.Address);
                cmd.Parameters.AddWithValue("@ContactInfo", borrower.ContactInfo);
                cmd.ExecuteNonQuery();
            }
        }
    }
}
