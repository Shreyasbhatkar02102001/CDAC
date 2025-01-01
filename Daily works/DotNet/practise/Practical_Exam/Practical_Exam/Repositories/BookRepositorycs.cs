using Practical_Exam.Models;
using MySql.Data.MySqlClient;
using System.Net;
using System.Collections.Generic;

namespace Practical_Exam.Repositories
{
    public class BookRepositorycs : IBookRepository
    {
        string connectionString = "server=localhost; database=practical; user=root; password=cdac";

        public void Add(Book book)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "insert into book(Author, Category, IsAvailable) values(@Author, @Category, @IsAvailable)";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@Author", book.Author);
                cmd.Parameters.AddWithValue("@Category", book.Category);
                cmd.Parameters.AddWithValue("@IsAvailable", book.IsAvailable);
                cmd.ExecuteNonQuery();

  

            }
        }

        public void Delete(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "delete from book where bookid=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@id", id);
                cmd.ExecuteNonQuery();
            }
        }

        public List<Book> GetAllBooks(Book book)
        {
            using(MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "select * from book";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                MySqlDataReader reader = cmd.ExecuteReader();

                List<Book> list = new List<Book>();

                while (reader.Read())
                {
                    //BookId, Title, Author, Category, IsAvailable(boolean), CreatedDate, UpdatedDate
                    Book book1 = new Book();
                    book1.BookId = int.Parse(reader["BookId"].ToString());
                    book1.Title = reader["Title"].ToString();
                    book1.Author = reader["Author"].ToString();
                    book1.Category = reader["Category"].ToString();
                    book1.IsAvailable = bool.Parse(reader["IsAvailable"].ToString());
                    book1.CreatedDate = DateTime.Parse(reader["CreatedDate"].ToString());
                    book1.UpdatedDate = DateTime.Parse(reader["UpdatedDate"].ToString());
                    list.Add(book1);
                }

                return list;
            }
        }

        public Book GetBookById(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "select * from book where bookid=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@id", id);
                MySqlDataReader reader = cmd.ExecuteReader();

                Book book1 = new Book();

                if (reader.Read())
                {
                    //BookId, Title, Author, Category, IsAvailable(boolean), CreatedDate, UpdatedDate
                    
                    book1.BookId = int.Parse(reader["BookId"].ToString());
                    book1.Title = reader["Title"].ToString();
                    book1.Author = reader["Author"].ToString();
                    book1.Category = reader["Category"].ToString();
                    book1.IsAvailable = bool.Parse(reader["IsAvailable"].ToString());
                    book1.CreatedDate = DateTime.Parse(reader["CreatedDate"].ToString());
                    book1.UpdatedDate = DateTime.Parse(reader["UpdatedDate"].ToString());
                    
                }
                
                return book1;
            }
        }

        public void Update(Book book)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "update book set(Author=@Author, Category=@Category, IsAvailable=@IsAvailable) where bookid=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.AddWithValue("@id", book.BookId);
                cmd.Parameters.AddWithValue("@Author", book.Author);
                cmd.Parameters.AddWithValue("@Category", book.Category);
                cmd.Parameters.AddWithValue("@IsAvailable", book.IsAvailable);
                cmd.ExecuteNonQuery();



            }
        }
    }
}
