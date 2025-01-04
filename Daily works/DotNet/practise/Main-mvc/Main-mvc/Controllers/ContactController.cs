using System.Text;
using Main_mvc.Models;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;

namespace Main_mvc.Controllers
{
    public class ContactController : Controller
    {
        private string url = "https://localhost:7269/api/ContactUs/";
        private HttpClient client = new HttpClient();

        [HttpGet]
        public IActionResult Index()
        {
            List<Contact> contacts = new List<Contact>();
            HttpResponseMessage response = client.GetAsync(url).Result;
            if (response.IsSuccessStatusCode)
            {
                string result = response.Content.ReadAsStringAsync().Result;
                var data  = JsonConvert.DeserializeObject<List<Contact>>(result);
                if (data != null)
                {
                    contacts = data;
                }
            }
            return View(contacts);
        }


        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }


        [HttpPost]
        public IActionResult Create(Contact con)
        {
            string data = JsonConvert.SerializeObject(con);
            StringContent content = new StringContent(data, Encoding.UTF8,"application/json" );
            HttpResponseMessage response  = client.PostAsync(url, content).Result;
            if (response.IsSuccessStatusCode)
            {
                TempData["insert_message"] = "Student Added ...!!!";
                return RedirectToAction("Index");
            }
            return View();
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            Contact con = new Contact();
            HttpResponseMessage response = client.GetAsync(url + id).Result;
            if (response.IsSuccessStatusCode)
            {
                string result = response.Content.ReadAsStringAsync().Result;
                var data = JsonConvert.DeserializeObject<Contact>(result);
                if (data != null)
                {
                    con = data;
                }
            }
            return View(con);
        }

        [HttpPost]
        public IActionResult Edit(Contact con)
        {
            string data = JsonConvert.SerializeObject(con);
            StringContent content = new StringContent(data, Encoding.UTF8, "application/json");
            HttpResponseMessage response = client.PutAsync(url + con.contactId, content ).Result;
            if (response.IsSuccessStatusCode)
            {

                TempData["update_message"] = "Student Updated ...!!!";
                return RedirectToAction("Index");
            }
            return View(con);
        }



        [HttpGet]
        public IActionResult Details(int id)
        {
            Contact con = new Contact();
            HttpResponseMessage response = client.GetAsync(url + id).Result;
            if (response.IsSuccessStatusCode)
            {
                string result = response.Content.ReadAsStringAsync().Result;
                var data = JsonConvert.DeserializeObject<Contact>(result);
                if (data != null)
                {
                    con = data;
                }
            }
            return View(con);
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Contact con = new Contact();
            HttpResponseMessage response = client.GetAsync(url + id).Result;
            if (response.IsSuccessStatusCode)
            {
                string result = response.Content.ReadAsStringAsync().Result;
                var data = JsonConvert.DeserializeObject<Contact>(result);
                if (data != null)
                {
                    con = data;
                }
            }
            return View(con);
        }

        [HttpPost, ActionName("Delete")]
        public IActionResult DeleteConfirmed(int id)
        {
            Contact con = new Contact();
            HttpResponseMessage response = client.DeleteAsync(url + id).Result;
            if (response.IsSuccessStatusCode)
            {
                TempData["delete_message"] = "Student Deleted ...!!!";
                return RedirectToAction("Index");
            }
            return View(con);
        }


    }
}
