using OnlineShoppingPortal.Models;
using Newtonsoft.Json;

namespace OnlineShoppingPortal.Repositories
{

    //Serialization JSON

    public class JsonDataRespository : IDataRepository
    {
        public void Delete(int id)
        {
            throw new NotImplementedException();
        }

        public List<Product> GetAll()
        {
           List<Product> products = new List<Product>();
            /*products= new List<Product>(){
               new Product(){Id=1,Title="Laptop",Price=100},
               new Product(){Id=2,Title="Mobile Phone ",Price=200},
               new Product(){Id=3,Title="Smart Tv",Price=300},
               new Product(){Id=4,Title="Google Glass",Price=400},
               new Product(){Id=5,Title="Camera",Price=500}
           };
            */

            //Read JSON file
            using (StreamReader r = new StreamReader(@"d:\products.json"))
            {
                string json = r.ReadToEnd();
                products = JsonConvert.DeserializeObject<List<Product>>(json);
            }
            return products;
        }

        public Product GetById(int id)
        {
            throw new NotImplementedException();
        }

        public void Insert(Product product)
        {
            throw new NotImplementedException();
        }

        public void Update(Product product)
        {
            throw new NotImplementedException();
        }
    }
}
