using Practical_Exam.Models;
using Practical_Exam.Repositories;

namespace Practical_Exam.Services
{
    public class BookService : IBookService
    {
        public IBookRepository bookRepository;

        public BookService(IBookRepository bookRepo)
        {
            bookRepository = bookRepo;
        }

        public void Add(Book book)
        {
            bookRepository.Add(book);
        }

        public void Delete(int id)
        {
            bookRepository.Delete(id);
        }

        public List<Book> GetAllBooks(Book book)
        {
            return bookRepository.GetAllBooks(book);
        }

        public Book GetBookById(int id)
        {
            return bookRepository.GetBookById(id);
        }

        public void Update(Book book)
        {
            bookRepository.Update(book);
        }
    }
}
