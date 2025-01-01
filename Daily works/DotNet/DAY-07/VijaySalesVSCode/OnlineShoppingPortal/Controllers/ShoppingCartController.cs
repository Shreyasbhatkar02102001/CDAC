using Microsoft.AspNetCore.Mvc;

namespace OnlineShoppingPortal.Controllers
{
    public class ShoppingCartController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult Checkout()
        {
            return View();
        }
        public IActionResult AddToCart(int id)
        {

            return View();
        }
        public IActionResult RemoveFromCart(int id)
        {
            return View();
        }
    }
}
