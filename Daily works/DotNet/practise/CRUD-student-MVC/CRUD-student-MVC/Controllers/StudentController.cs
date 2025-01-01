using CRUD_student_MVC.Services.Interfaces;
using CRUD_student_MVC.Models;
using Microsoft.AspNetCore.Mvc;

namespace CRUD_student_MVC.Controllers
{
    public class StudentController : Controller
    {
        public IStudentService studentService;

        public StudentController(IStudentService studentServe)
        {
            studentService = studentServe;
        }
        public IActionResult Index()
        {
            var users = studentService.getAll();
            return View(users);
        }

        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Create(Student student)
        {
            if (ModelState.IsValid)
            {
                studentService.add(student);
                return RedirectToAction("Index");
            }
            return View();
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            var user = studentService.getById(id);
            if (user == null)
            {
                return NotFound();
            }

            return View(user);  
        }

        [HttpPost]
        public IActionResult Edit(Student student)
        {
            if (ModelState.IsValid)
            {
                studentService.update(student);
                return RedirectToAction("Index");
            }
            return View();
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            var user = studentService.getById(id);
            if (user == null)
            {
                return NotFound();
            }

            return View(user);
        }

        [HttpPost, ActionName("Delete")]
        public IActionResult Delete(Student student)
        {
            if (ModelState.IsValid)
            {
                studentService.deleteById(student.studentID);
                return RedirectToAction("Index");
            }
            return View(student);
        }

    }
}
