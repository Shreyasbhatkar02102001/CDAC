using System.Data;
using HomeWork_MS.NET_MVC_.Models;
using MySql.Data.MySqlClient;

namespace HomeWork_MS.NET_MVC_.Repository
{



    public class UserRepository : IUserRepository
    {
        string connectionString = "server=localhost;database=DotNetHW;user=root;password=cdac";


        //public void insert(string FirstName, string LastName,  string email, int Contact, string password)
        public void insert(User user)
        { 
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    //MySqlConnection connection = new MySqlConnection(connectionString);
                    connection.Open();
                    string query = "insert into user(FirstName, LastName, email, Contact, password) values(@Fname, @Lname, @email, @contact, @password)";
                    MySqlCommand command = new MySqlCommand(query, connection);
                    command.Parameters.Add(new MySqlParameter("@Fname", user.FirstName));
                    command.Parameters.Add(new MySqlParameter("@Lname", user.LastName));
                    command.Parameters.Add(new MySqlParameter("@email", user.Email));
                    command.Parameters.Add(new MySqlParameter("@contact", user.Contact));
                    command.Parameters.Add(new MySqlParameter("@password", user.Password));
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
        }
   

        public bool validate(string email, string password)
        {
            using(MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    connection.Open();
                    string query = "select count(*) from user where Email = @email and Password = @password";
                    MySqlCommand command = new MySqlCommand(query, connection);
                    command.Parameters.Add(new MySqlParameter("@email", email));
                    command.Parameters.Add(new MySqlParameter("@password", password));
                    int count = int.Parse((command.ExecuteScalar()).ToString());
                    return count > 0;
                    

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
        }
    }
}
