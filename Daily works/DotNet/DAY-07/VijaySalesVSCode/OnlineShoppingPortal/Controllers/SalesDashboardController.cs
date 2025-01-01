using Microsoft.AspNetCore.Mvc;

namespace OnlineShoppingPortal.Controllers
{
    public class SalesDashboardController : Controller
    {


        public IActionResult FetchSalesData()
        {

            var salesData = new
            {
                SalesDate = DateTime.Now,
                Mumbai = 56000,
                Pune = 87000,
                Chennai = 7800,
                Delhi = 45000
            };
            return Json(salesData);


        }
        public IActionResult Index()
        {

            //get data from service

            //viewdata
            //viewbag



            return View();
        }
    }
}
