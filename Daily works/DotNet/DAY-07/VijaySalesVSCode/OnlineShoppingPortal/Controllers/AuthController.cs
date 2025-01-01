using Microsoft.AspNetCore.Mvc;
using System.Reflection.Metadata.Ecma335;

namespace OnlineShoppingPortal.Controllers
{
    public class AuthController : Controller
    {

        //set of action methods

        //Http Get Action Method

        [HttpGet]   //Attribute : Metadata about the method
        public IActionResult Login()
        {

            //return this.RedirectToAction("Register");
            //return Json();
            return View();
        }

        [HttpPost]
        public IActionResult Login( string  username, string password)
        {

           if(username =="ravi" && password == "seed")
            {
                return RedirectToAction("index", "orders");
            }
            else
            return View();
        }

        
        public IActionResult Logout() {

            return View();
        }
        public IActionResult Register()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Register(string firstName, string lastname, string email, 
                                    string contact, string username, string password)
        {


            return View();
        }


        public IActionResult ChangePassword()
        {
            return View();
        }
    }
}
