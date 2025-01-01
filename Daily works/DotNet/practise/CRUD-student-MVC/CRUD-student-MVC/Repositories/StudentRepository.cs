using System.Reflection;
using System.Xml.Linq;
using CRUD_student_MVC.Models;
using Microsoft.AspNetCore.Mvc.RazorPages;
using MySql.Data.MySqlClient;

namespace CRUD_student_MVC.Repositories
{
    public class StudentRepository : IStudentRepository
    {
        string connectionString = "server=localhost; database=dotnet; user=root; password=cdac";

        public List<Student> getAll()
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "select * from students";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                MySqlDataReader reader = cmd.ExecuteReader();

                List<Student> result = new List<Student>();

                while (reader.Read())
                {
                    Student student = new Student();
                    student.studentID = int.Parse(reader["studentId"].ToString());
                    student.name = reader["name"].ToString();
                    student.age = int.Parse(reader["age"].ToString());
                    student.gender = char.Parse(reader["gender"].ToString()) ;
                    student.major = reader["major"].ToString();
                    student.about = reader["about"].ToString();
                    result.Add(student);
                }

                return result;
            }
        }

        public Student getById(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "select * from students where studentID=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.Add(new MySqlParameter("@id", id));
                MySqlDataReader reader = cmd.ExecuteReader();

                Student student = new Student();

                if (reader.Read())
                {
                    ;
                    student.studentID = int.Parse(reader["studentId"].ToString());
                    student.name = reader["name"].ToString();
                    student.age = int.Parse(reader["age"].ToString());
                    student.gender = char.Parse(reader["gender"].ToString());
                    student.major = reader["major"].ToString();
                    student.about = reader["about"].ToString();
                }

                return student;
            }

        }

        public void add(Student student)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "insert into students(name, age, gender, major, about) values(@name, @age, @gender, @major, @about)";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.Add(new MySqlParameter("@name", student.name));
                cmd.Parameters.Add(new MySqlParameter("@age", student.age));
                cmd.Parameters.Add(new MySqlParameter("@gender", student.gender));
                cmd.Parameters.Add(new MySqlParameter("@major", student.major));
                cmd.Parameters.Add(new MySqlParameter("@about", student.about));
                cmd.ExecuteNonQuery();

            }
        }

        public void update(Student student)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "update students set name=@name , age=@age, gender=@gender, major=@major, about=@about where studentID=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.Add(new MySqlParameter("@id", student.studentID));
                cmd.Parameters.Add(new MySqlParameter("@name", student.name));
                cmd.Parameters.Add(new MySqlParameter("@age", student.age));
                cmd.Parameters.Add(new MySqlParameter("@gender", student.gender));
                cmd.Parameters.Add(new MySqlParameter("@major", student.major));
                cmd.Parameters.Add(new MySqlParameter("@about", student.about));
                cmd.ExecuteNonQuery();

            }
        }

        public void deleteById(int id)
        {
            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                connection.Open();
                string query = "delete from students where studentID=@id";
                MySqlCommand cmd = new MySqlCommand(query, connection);
                cmd.Parameters.Add(new MySqlParameter("@id", id));
                cmd.ExecuteNonQuery();

            }
        }
    }
}
