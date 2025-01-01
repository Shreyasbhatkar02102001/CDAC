using OnlineShoppingPortal.Models;
using OnlineShoppingPortal.Repositories;

namespace OnlineShoppingPortal.Services
{
    public class ProductService : IProductService
    {

       private IDataRepository dataRepository;


        public ProductService(IDataRepository repo) {
            dataRepository = repo;
        }
        public void AddProduct(Product product)
        {
            throw new NotImplementedException();
        }

        public void DeleteProduct(int id)
        {
            throw new NotImplementedException();
        }

        public List<Product> GetAllProducts()
        {
            List<Product> products= dataRepository.GetAll();
            return products;
            //throw new NotImplementedException();
        }

        public Product GetProductById(int id)
        {
            throw new NotImplementedException();
        }

        public void UpdateProduct(Product product)
        {
            throw new NotImplementedException();
        }
    }
}
