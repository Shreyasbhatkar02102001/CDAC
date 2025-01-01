using Microsoft.AspNetCore.Mvc;
using OnlineShoppingPortal.Models;

namespace OnlineShoppingPortal.Controllers
{
    public class CustomersController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        [HttpGet]
        public IActionResult Create()
        {
            Customer customer = new Customer();
            customer.FirstName= "Ravi";
            customer.LastName = "Tambade";
            customer.Age = 49;

            return View(customer);
        }

        [HttpPost]
        public  IActionResult Create(Customer customer)
        {

            if (ModelState.IsValid)
            {

                return RedirectToAction("Index");
            }

            return View(customer);
        }

    }
}
