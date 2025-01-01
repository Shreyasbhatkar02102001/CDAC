using Entities;
using Services.Interfaces;
using Repositories.Interfaces;

namespace Services.Implementations
{
    public class ProductService:IProductService
    {
        private IProductRepository dataRepository;


        public ProductService(IProductRepository repo)
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
