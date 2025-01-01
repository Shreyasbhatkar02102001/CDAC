using Microsoft.AspNetCore.Mvc;
using OnlineShoppingPortal.Models;
using OnlineShoppingPortal.Services.Interfaces;
using System.Dynamic;
using System.Reflection.Metadata.Ecma335;

namespace OnlineShoppingPortal.Controllers
{
    public class ProductsController : Controller
    {
        //Dependency Injection
        private IProductService Service;

        public ProductsController(IProductService svc)
        {
            this.Service = svc;
        }
        //set of action methods
        public IActionResult Index()
        {
            
            List<Product> products= Service.GetAllProducts();
            this.ViewData["Products"] = products;
            return View();
            //return Json(products);

        }

        public IActionResult List()
        {
            //List of products
            //List<Product> products=TempData["Products"] as List<Product>;
             string message = TempData["Products"] as string;
            //return View(message);
            message += " CDAC Mumbai";
            ViewBag.Message = message;
            return View();

            //return View(products);

        }
        public IActionResult Details(int id)
        {
            //Product details
            return View();
        }
    }
}
