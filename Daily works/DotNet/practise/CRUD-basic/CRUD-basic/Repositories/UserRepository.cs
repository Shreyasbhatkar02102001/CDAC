using CRUD_basic.Models;
using MySql.Data.MySqlClient;

namespace CRUD_basic.Repositories
{
    public class UserRepository : IUserRepository
    {
        string connectionString = "server=localhost; database=dotnet; user=root; password=cdac";

        public List<User> getAll()
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                List<User> users = new List<User>();
                try
                {
                    connection.Open();
                    string query = "select * from user";
                    MySqlCommand cmd = new MySqlCommand(query, connection);
                    MySqlDataReader reader = cmd.ExecuteReader();


                    while (reader.Read())
                    {
                        User user1 = new User();
                        user1.Id = int.Parse(reader["Id"].ToString());
                        user1.Name = reader["Name"].ToString();
                        user1.Email = reader["Email"].ToString();
                        user1.Contact = int.Parse(reader["Contact"].ToString());
                        user1.Created = DateTime.Parse(reader["Created"].ToString());
                        user1.Updated = DateTime.Parse(reader["Updated"].ToString());
                        users.Add(user1);
                    }
                    
                }
                catch (Exception ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();
                }
                return users;
            }
        }

        public User getById(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                //List<User> users = new List<User>();
                User user1 = new User();
                try
                {
                    connection.Open();
                    string query = "select * from user where id=@id";
                    MySqlCommand cmd = new MySqlCommand(query, connection);
                    cmd.Parameters.Add(new MySqlParameter("@id", id));
                    MySqlDataReader reader = cmd.ExecuteReader();


                    if (reader.Read())
                    {
                        
                        user1.Id = int.Parse(reader["Id"].ToString());
                        user1.Name = reader["Name"].ToString();
                        user1.Email = reader["Email"].ToString();
                        user1.Contact = int.Parse(reader["Contact"].ToString());
                        user1.Created = DateTime.Parse(reader["Created"].ToString());
                        user1.Updated = DateTime.Parse(reader["Updated"].ToString());
                        //users.Add(user1);
                    }

                }
                catch (Exception ex)
                {
                    throw ex;
                }
                finally
                {
                    connection.Close();
                }
                return user1;
            }
        }

        public void add(User user)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                
                try
                {
                    connection.Open();
                    string query = "insert into user(Name, Email, Contact, Created, Updated) Values(@Name, @Email, @Contact, @Created, @Updated)";
                    MySqlCommand cmd = new MySqlCommand(query, connection);
                    cmd.Parameters.Add(new MySqlParameter("@Name", user.Name ));
                    cmd.Parameters.Add(new MySqlParameter("@Email", user.Email));
                    cmd.Parameters.Add(new MySqlParameter("@Contact", user.Contact));
                    cmd.Parameters.Add(new MySqlParameter("@Created", user.Created));
                    cmd.Parameters.Add(new MySqlParameter("@Updated", user.Updated));
                    cmd.ExecuteNonQuery();

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

        public void update(User user)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {

                try
                {
                    connection.Open();
                    string query = "update user set Name=@Name, Email=@Email, Contact=@Contact where id=@id";
                    MySqlCommand cmd = new MySqlCommand(query, connection);
                    cmd.Parameters.Add(new MySqlParameter("@id", user.Id));
                    cmd.Parameters.Add(new MySqlParameter("@Name", user.Name));
                    cmd.Parameters.Add(new MySqlParameter("@Email", user.Email));
                    cmd.Parameters.Add(new MySqlParameter("@Contact", user.Contact));
                    cmd.ExecuteNonQuery();

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

        public void deleteById(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {

                try
                {
                    connection.Open();
                    string query = "delete  from user where id=@id";
                    MySqlCommand cmd = new MySqlCommand(query, connection);
                    cmd.Parameters.Add(new MySqlParameter("@id", id));
                    cmd.ExecuteNonQuery();

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
