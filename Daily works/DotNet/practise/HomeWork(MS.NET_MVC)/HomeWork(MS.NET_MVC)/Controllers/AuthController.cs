using HomeWork_MS.NET_MVC_.Models;
using HomeWork_MS.NET_MVC_.Services;
using Microsoft.AspNetCore.Mvc;


namespace HomeWork_MS.NET_MVC_.Controllers
{
    public class AuthController: Controller
    {
        private IUserService userService;

        public AuthController(IUserService repo)
        {
            userService = repo;
        }

        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string email, string password)
        {
            if (userService.validate(email, password))
            {
                return RedirectToAction("Index", "Home");
            }
            return View();
        }

  

        [HttpGet]
        public IActionResult Register()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Register(User user)
        {
            if (!userService.validate(user.Email, user.Password))
            {
                userService.insert(user);
                return RedirectToAction("Login");
            }
            return View();
        }
    }
}
