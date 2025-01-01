using OnlineShoppingPortal.Models;
using OnlineShoppingPortal.Repositories;
using OnlineShoppingPortal.Services.Interfaces;

namespace OnlineShoppingPortal.Services.Implementation
{
    public class ProductService : IProductService
    {

        private IDataRepository dataRepository;


        public ProductService(IDataRepository repo)
        {
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
            List<Product> products = dataRepository.GetAll();
            return products;
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
