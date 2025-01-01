using Practical_Exam.Models;

namespace Practical_Exam.Services
{
    public interface IBookService
    {
        public List<Book> GetAllBooks(Book book);

        public Book GetBookById(int id);

        public void Add(Book book);

        public void Update(Book book);

        public void Delete(int id);
    }
}
