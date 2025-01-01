using CRUD_basic.Services.Interfaces;
using Microsoft.AspNetCore.Mvc;
using CRUD_basic.Models;

namespace CRUD_basic.Controllers
{
    public class UserController : Controller
    {
        public IUserService userService;
        public UserController(IUserService userServe)
        {
            userService = userServe;
        }

        public IActionResult Index()
        {
            var users = userService.getAll();
            return View(users);
        }

        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Create(User user)
        {
            if (ModelState.IsValid)
            {
                userService.add(user);
                return RedirectToAction("Index");
            }
            return View(user);
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            var user = userService.getById(id);
            if (user == null)
            {
                return NotFound();
            }
            return View(user);
        }

        [HttpPost]
        public IActionResult Edit(User user)
        {
            if(ModelState.IsValid)
            {
                userService.update(user);
                return RedirectToAction("Index");
            }
            return View(user);
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            var user = userService.getById(id);
            if (user == null)
            {
                return NotFound();
            }
            return View(user);
        }

        [HttpPost, ActionName("Delete")]
        public IActionResult Delete(User user)
        {
            if (ModelState.IsValid)
            {
                userService.deleteById(user.Id);
                return RedirectToAction("Index");
            }
            return View(user);

            
        }

        
    }
}
