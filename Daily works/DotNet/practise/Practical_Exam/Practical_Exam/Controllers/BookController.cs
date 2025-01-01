using Microsoft.AspNetCore.Mvc;
using Practical_Exam.Models;
using MySql.Data.MySqlClient;
using Practical_Exam.Services;

namespace Practical_Exam.Controllers
{
    public class BookController : Controller
    {
        public IBookService bookService;

        public BookController(IBookService bookServe)
        {
            bookService = bookServe;
        }

        public IActionResult Index()
        {
            var book = bookService.GetAllBooks;
            return View(book);
        }

        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Create(Book book)
        {
            if (ModelState.IsValid)
            {
                bookService.Add(book);
                return RedirectToAction("Index");
            }
            return View();
        }

        public IActionResult Edit(int id)
        {
            var book = bookService.GetBookById(id);
            if (book == null)
            {
                return NotFound();
            }
            return View(book);
        }

        [HttpPost]
        public IActionResult Edit(Book book)
        {
            if (ModelState.IsValid)
            {
                bookService.Update(book);
                return RedirectToAction("Index");
            }
            return View(book);
        }

        public IActionResult Delete(int id)
        {
            var book = bookService.GetBookById(id);
            if (book == null)
            {
                return NotFound();
            }
            return View(book);
        }

        [HttpPost, ActionName("Delete")]
        public IActionResult Delete(Book book)
        {
            if (ModelState.IsValid)
            {
                bookService.Delete(book.BookId);
                return RedirectToAction("Index");
            }
            return View(book);
        }



    }
}
