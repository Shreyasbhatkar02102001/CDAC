using Microsoft.AspNetCore.Mvc;

namespace OnlineShoppingPortal.Controllers
{
    public class OrdersController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult Details(int id)
        {

            return View();
        }
        public IActionResult Cancel(int id)
        {
            return View();
        }

    }
}
